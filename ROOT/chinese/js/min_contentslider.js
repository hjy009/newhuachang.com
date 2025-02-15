function featuredcontentslider_init(a) {
    featuredcontentslider.init(a)
}
var featuredcontentslider = {
    settingcaches: {},
    init: function(a) {
        if (this.$(a.id) == null) return;
        this.settingcaches[a.id] = a;
        a.contentdivs = [];
        a.toclinks = [];
        a.topzindex = 0;
        a.currentpage = a.playtab || 1;
        a.prevpage = a.currentpage;
        a.etype = "on" + (a.revealtype || "click");
        a.curopacity = 0;
        this.buildpaginate(a)
    },
    buildpaginate: function(b) {
        this.buildcontentdivs(b);
        var e = this.$(b.id),
        f = this.$("paginate-" + b.id),
        j = "",
        i = b.toc,
        d = b.nextprev;
        if (typeof i == "string" && i != "markup" && i != "scroll" || typeof i == "object") {
            for (var c = 1; c <= b.contentdivs.length; c++) {
                j += '<i class="iToc iToc' + c + '"><a href="#' + c + '" class="toc">' + (typeof i == "string" ? i.replace(/#increment/, c) : i[c - 1]) + '</a></i> '
            }
            j = (d[0] != '' ? '<i class="iToc iToc' + c + '"><a href="#prev" class="prev">' + d[0] + '</a></i> ': '') + j + (d[1] != '' ? '<i class="iToc iToc' + c + '"><a href="#next" class="next">' + d[1] + '</a></i>': '');
            f.innerHTML = '<i class="subLineTab"></i><span class="subPageTab">' + j + '</span>'
        }
        var h = [],
        m = f.getElementsByTagName("*");
        for (var c = 0; c < m.length; c++) {
            if (m[c].nodeType == 1) h.push(m[c])
        }
        var k = 0,
        n = this;
        for (var c = 0; c < h.length; c++) {
            if (this.css(h[c], "toc", "check")) {
                if (k > b.contentdivs.length - 1) {
                    h[c].style.display = "none";
                    continue
                }
                if (i == "scroll") {
                    if (!k) {
                        var o = f.getElementsByTagName("div");
                        this.masker = o[0];
                        this.maskee = o[1];
                        this.thumbWidth = [0]
                    }
                    var l = this.thumbWidth,
                    g = h[c];
                    g.style.styleFloat = g.style.cssFloat = "left";
                    l.push(l[l.length - 1] + g.offsetWidth + this.style(g, "marginLeft", true) + this.style(g, "marginRight", true) + this.style(g, "borderLeftWidth", true) + this.style(g, "borderRightWidth", true))
                }
                h[c].setAttribute("rel", ++k);
                h[c][b.etype] = function() {
                    var a = this.getAttribute("rel");
                    if (n.delayTimer) window.clearTimeout(n.delayTimer);
                    n.delayTimer = window.setTimeout(function() {
                        featuredcontentslider.turnpage(b, a)
                    },
                    b.delay);
                    return false
                };
                b.toclinks.push(h[c])
            } else if (this.css(h[c], "prev", "check") || this.css(h[c], "next", "check")) {
                h[c].onclick = function() {
                    featuredcontentslider.turnpage(b, this.className);
                    return false
                }
            }
        }
        this.turnpage(b, b.currentpage, true);
        if (b.autorotate[0]) {
            f[b.etype] = function() {
                return false
            };
            e["onmouseover"] = f["onmouseover"] = function() {
                featuredcontentslider.cleartimer(b, window["fcsautorun" + b.id]);
                return true
            };
            e["onmouseout"] = f["onmouseout"] = function() {
                featuredcontentslider.autorotate(b);
                return true
            };
            b.autorotate[1] = b.autorotate[1] + (1 / b.enablefade[1] * 80);
            this.autorotate(b)
        }
    },
    buildcontentdivs: function(a) {
        var b = this.$(a.id).getElementsByTagName("div");
        for (var e = 0; e < b.length; e++) {
            if (this.css(b[e], "contentdiv", "check")) {
                a.contentdivs.push(b[e]);
                b[e].style.display = "none";
                b[e].style.overflow = "hidden"
            }
        }
    },
    jumpTo: function(a, b) {
        this.turnpage(this.settingcaches[a], b)
    },
    turnpage: function(a, b, e) {
        var f = a.currentpage,
        j = a.contentdivs,
        i = j.length,
        d = (/prev/i.test(b)) ? f - 1 : (/next/i.test(b)) ? f + 1 : b | 0;
        d = (d < 1) ? i: (d > i) ? 1 : d;
        if (d == a.currentpage && typeof e == "undefined") return;
        a.currentpage = d;
        j[a.prevpage - 1].style.display = "none";
        j[d - 1].style.zIndex = ++a.topzindex;
        this.cleartimer(a, window["fcsfade" + a.id]);
        a.cacheprevpage = a.prevpage;
        if (a.enablefade[0]) {
            a.curopacity = 0;
            this.fadeup(a)
        }
        j[d - 1].style.visibility = "visible";
        j[d - 1].style.display = "block";
        if (a.prevpage <= a.toclinks.length) this.css(a.toclinks[a.prevpage - 1], "selected", "remove");
        if (d <= a.toclinks.length) this.css(a.toclinks[d - 1], "selected", "add");
        a.prevpage = d;
        if (a.toc == "scroll") {
            var c = this,
            h = 0.25,
            m = 20,
            k = c.masker.clientWidth,
            n = a.contentdivs.length,
            o = a.toclinks[d - 1],
            l = this.thumbWidth[this.thumbWidth.length - 1],
            d = k / 2 - o.offsetWidth / 2 - this.thumbWidth[d - 1],
            g = c.maskee.currentStyle ? c.maskee.currentStyle["marginLeft"] : window.getComputedStyle(c.maskee, "").getPropertyValue("margin-left");
            g = g.substr(0, g.length - 2) | 0;
            d = d <= k - l ? k - l: d;
            d = d > 0 ? 0 : d;
            function p() {
                g += (d - g) * h;
                if (Math.round(d - g) == 0) {
                    window.clearInterval(c.thumbTimer);
                    return
                }
                c.maskee.style.marginLeft = Math.ceil(g) + "px"
            }
            if (c.thumbTimer) window.clearInterval(c.thumbTimer);
            c.thumbTimer = window.setInterval(p, m)
        }
    },
    setopacity: function(a, b) {
        var e = a.contentdivs[a.currentpage - 1];
        e.className = "contentdiv sliderfilter";
        e.style.cssText += ";filter:alpha(opacity=" + b * 100 + ");-moz-opacity:" + b + ";opacity:" + b;
        a.curopacity = b
    },
    fadeup: function(a) {
        if (a.curopacity <= 0.95) {
            this.setopacity(a, a.curopacity + a.enablefade[1]);
            window["fcsfade" + a.id] = setTimeout(function() {
                featuredcontentslider.fadeup(a)
            },
            25)
        } else {
            this.setopacity(a, 1);
            var b = a.contentdivs[a.currentpage - 1];
            b.className = "contentdiv";
            if (a.cacheprevpage != a.currentpage) a.contentdivs[a.cacheprevpage - 1].style.display = "none"
        }
    },
    cleartimer: function(a, b) {
        if (b) {
            clearTimeout(b);
            clearInterval(b);
            if (a.cacheprevpage != a.currentpage) {
                a.contentdivs[a.cacheprevpage - 1].style.display = "none"
            }
        }
    },
    css: function(a, b, e) {
        var f = new RegExp("(^|\\s+)" + b + "($|\\s+)", "ig");
        if (e == "check") return f.test(a.className);
        else if (e == "remove") a.className = a.className.replace(f, "");
        else if (e == "add") a.className += " " + b
    },
    style: function(a, b, e) {
        var f;
        if (a.currentStyle) {
            f = a.currentStyle[b]
        } else if (window.getComputedStyle) {
            b = b.replace(/([A-Z])/g, "-$1");
            b = b.toLowerCase();
            f = window.getComputedStyle(a, "").getPropertyValue(b)
        }
        return ! e ? f: f.substr(0, f.length - 2) | 0
    },
    autorotate: function(a) {
        window["fcsautorun" + a.id] = setInterval(function() {
            featuredcontentslider.turnpage(a, "next")
        },
        a.autorotate[1])
    },
    $: function(a) {
        return document.getElementById(a)
    }
}