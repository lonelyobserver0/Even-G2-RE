package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.stub.StubApp;
import gb.C0973b;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends AccessibilityNodeProvider {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f15187z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f15188a;

    /* renamed from: b, reason: collision with root package name */
    public final C0973b f15189b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f15190c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f15191d;

    /* renamed from: e, reason: collision with root package name */
    public final PlatformViewsAccessibilityDelegate f15192e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f15193f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f15194g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15195h;

    /* renamed from: i, reason: collision with root package name */
    public h f15196i;
    public Integer j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f15197k;

    /* renamed from: l, reason: collision with root package name */
    public int f15198l;

    /* renamed from: m, reason: collision with root package name */
    public h f15199m;

    /* renamed from: n, reason: collision with root package name */
    public h f15200n;

    /* renamed from: o, reason: collision with root package name */
    public h f15201o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f15202p;

    /* renamed from: q, reason: collision with root package name */
    public int f15203q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f15204r;

    /* renamed from: s, reason: collision with root package name */
    public s2.d f15205s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15206t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15207u;

    /* renamed from: v, reason: collision with root package name */
    public final b f15208v;

    /* renamed from: w, reason: collision with root package name */
    public final c f15209w;

    /* renamed from: x, reason: collision with root package name */
    public final d f15210x;

    /* renamed from: y, reason: collision with root package name */
    public final Xa.p f15211y;

    public l(View view, C0973b c0973b, AccessibilityManager accessibilityManager, ContentResolver contentResolver, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        int i3;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, PKIFailureInfo.notAuthorized);
        this.f15194g = new HashMap();
        this.f15195h = new HashMap();
        this.f15198l = 0;
        this.f15202p = new ArrayList();
        this.f15203q = 0;
        this.f15204r = 0;
        this.f15206t = false;
        this.f15207u = false;
        this.f15208v = new b(this);
        c cVar = new c(this);
        this.f15209w = cVar;
        Xa.p pVar = new Xa.p(this, new Handler(), 3);
        this.f15211y = pVar;
        this.f15188a = view;
        this.f15189b = c0973b;
        this.f15190c = accessibilityManager;
        this.f15193f = contentResolver;
        this.f15191d = accessibilityViewEmbedder;
        this.f15192e = platformViewsAccessibilityDelegate;
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        d dVar = new d(this, accessibilityManager);
        this.f15210x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        pVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor(StubApp.getString2(7432)), false, pVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i3 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i3 == Integer.MAX_VALUE || i3 < 300) {
                this.f15198l &= -9;
            } else {
                this.f15198l |= 8;
            }
            c0973b.f14324b.setAccessibilityFeatures(this.f15198l);
        }
        platformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f15191d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f15197k = recordFlutterId;
            this.f15199m = null;
            return true;
        }
        if (eventType == 128) {
            this.f15201o = null;
            return true;
        }
        if (eventType == 32768) {
            this.j = recordFlutterId;
            this.f15196i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f15197k = null;
        this.j = null;
        return true;
    }

    public final f b(int i3) {
        HashMap hashMap = this.f15195h;
        f fVar = (f) hashMap.get(Integer.valueOf(i3));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f15128c = -1;
        fVar2.f15127b = i3;
        fVar2.f15126a = 267386881 + i3;
        hashMap.put(Integer.valueOf(i3), fVar2);
        return fVar2;
    }

    public final h c(int i3) {
        HashMap hashMap = this.f15194g;
        h hVar = (h) hashMap.get(Integer.valueOf(i3));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f15159b = i3;
        hashMap.put(Integer.valueOf(i3), hVar2);
        return hVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        CharSequence b2;
        int i10;
        int i11;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f15191d;
        if (i3 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i3);
        }
        HashMap hashMap = this.f15194g;
        View view = this.f15188a;
        if (i3 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        h hVar = (h) hashMap.get(Integer.valueOf(i3));
        if (hVar != null) {
            int i12 = hVar.f15166i;
            PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate = this.f15192e;
            if (i12 == -1 || !platformViewsAccessibilityDelegate.usesVirtualDisplay(i12)) {
                AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i3);
                obtain2.setImportantForAccessibility((hVar.h(12) || (h.b(hVar) == null && hVar.f15161d == 0)) ? false : true);
                obtain2.setViewIdResourceName("");
                String str = hVar.f15171o;
                if (str != null) {
                    obtain2.setViewIdResourceName(str);
                }
                obtain2.setPackageName(view.getContext().getPackageName());
                obtain2.setClassName(StubApp.getString2(5904));
                obtain2.setSource(view, i3);
                obtain2.setFocusable(hVar.j());
                h hVar2 = this.f15199m;
                if (hVar2 != null) {
                    obtain2.setFocused(hVar2.f15159b == i3);
                }
                h hVar3 = this.f15196i;
                if (hVar3 != null) {
                    obtain2.setAccessibilityFocused(hVar3.f15159b == i3);
                }
                if (hVar.h(5)) {
                    obtain2.setPassword(hVar.h(11));
                    if (!hVar.h(21)) {
                        obtain2.setClassName(StubApp.getString2(18920));
                    }
                    obtain2.setEditable(!hVar.h(21));
                    int i13 = hVar.f15164g;
                    if (i13 != -1 && (i11 = hVar.f15165h) != -1) {
                        obtain2.setTextSelection(i13, i11);
                    }
                    h hVar4 = this.f15196i;
                    if (hVar4 != null && hVar4.f15159b == i3) {
                        obtain2.setLiveRegion(1);
                    }
                    if (h.a(hVar, e.f15112l)) {
                        obtain2.addAction(256);
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (h.a(hVar, e.f15113m)) {
                        obtain2.addAction(512);
                        i10 = 1;
                    }
                    if (h.a(hVar, e.f15122x)) {
                        obtain2.addAction(256);
                        i10 |= 2;
                    }
                    if (h.a(hVar, e.f15123y)) {
                        obtain2.addAction(512);
                        i10 |= 2;
                    }
                    obtain2.setMovementGranularities(i10);
                    if (hVar.f15162e >= 0) {
                        String str2 = hVar.f15174r;
                        obtain2.setMaxTextLength(((str2 == null ? 0 : str2.length()) - hVar.f15163f) + hVar.f15162e);
                    }
                }
                if (h.a(hVar, e.f15114n)) {
                    obtain2.addAction(PKIFailureInfo.unsupportedVersion);
                }
                if (h.a(hVar, e.f15115p)) {
                    obtain2.addAction(16384);
                }
                if (h.a(hVar, e.f15116q)) {
                    obtain2.addAction(PKIFailureInfo.notAuthorized);
                }
                if (h.a(hVar, e.f15117r)) {
                    obtain2.addAction(32768);
                }
                if (h.a(hVar, e.f15124z)) {
                    obtain2.addAction(PKIFailureInfo.badSenderNonce);
                }
                if (hVar.h(4)) {
                    obtain2.setClassName(StubApp.getString2(5906));
                }
                if (hVar.h(15)) {
                    obtain2.setClassName(StubApp.getString2(18921));
                }
                if (h.a(hVar, e.f15121w)) {
                    obtain2.setDismissable(true);
                    obtain2.addAction(PKIFailureInfo.badCertTemplate);
                }
                h hVar5 = hVar.f15147P;
                if (hVar5 != null) {
                    obtain2.setParent(view, hVar5.f15159b);
                } else {
                    obtain2.setParent(view);
                }
                int i14 = hVar.f15133B;
                if (i14 != -1) {
                    obtain2.setTraversalAfter(view, i14);
                }
                Rect rect = hVar.f15157Z;
                h hVar6 = hVar.f15147P;
                if (hVar6 != null) {
                    Rect rect2 = hVar6.f15157Z;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    obtain2.setBoundsInParent(rect3);
                } else {
                    obtain2.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(rect4);
                obtain2.setVisibleToUser(true);
                obtain2.setEnabled(!hVar.h(7) || hVar.h(8));
                if (h.a(hVar, e.f15104b)) {
                    if (hVar.f15151T != null) {
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar.f15151T.f15130e));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else if (hVar.h(24)) {
                    obtain2.addAction(16);
                    obtain2.setClickable(true);
                }
                if (h.a(hVar, e.f15105c)) {
                    if (hVar.f15152U != null) {
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar.f15152U.f15130e));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                e eVar = e.f15106d;
                boolean a3 = h.a(hVar, eVar);
                e eVar2 = e.f15109g;
                e eVar3 = e.f15108f;
                e eVar4 = e.f15107e;
                if (a3 || h.a(hVar, eVar3) || h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
                    obtain2.setScrollable(true);
                    if (hVar.h(19)) {
                        if (h.a(hVar, eVar) || h.a(hVar, eVar4)) {
                            if (j(hVar)) {
                                obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, hVar.j, false));
                            } else {
                                obtain2.setClassName(StubApp.getString2(18922));
                            }
                        } else if (j(hVar)) {
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar.j, 0, false));
                        } else {
                            obtain2.setClassName(StubApp.getString2(5043));
                        }
                    }
                    if (h.a(hVar, eVar) || h.a(hVar, eVar3)) {
                        obtain2.addAction(4096);
                    }
                    if (h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
                        obtain2.addAction(8192);
                    }
                }
                e eVar5 = e.f15110h;
                boolean a9 = h.a(hVar, eVar5);
                e eVar6 = e.j;
                if (a9 || h.a(hVar, eVar6)) {
                    obtain2.setClassName(StubApp.getString2(18923));
                    if (h.a(hVar, eVar5)) {
                        obtain2.addAction(4096);
                    }
                    if (h.a(hVar, eVar6)) {
                        obtain2.addAction(8192);
                    }
                }
                if (hVar.h(16)) {
                    obtain2.setLiveRegion(1);
                }
                if (hVar.h(5)) {
                    obtain2.setText(h.d(hVar.f15175s, hVar.f15174r));
                    CharSequence[] charSequenceArr = {hVar.e(), h.d(hVar.f15181y, hVar.f15180x)};
                    int i15 = 0;
                    CharSequence charSequence = null;
                    for (int i16 = 2; i15 < i16; i16 = 2) {
                        CharSequence charSequence2 = charSequenceArr[i15];
                        if (charSequence2 != null && charSequence2.length() > 0) {
                            if (charSequence != null && charSequence.length() != 0) {
                                charSequence2 = TextUtils.concat(charSequence, StubApp.getString2(81), charSequence2);
                            }
                            charSequence = charSequence2;
                        }
                        i15++;
                    }
                    obtain2.setHintText(charSequence);
                } else if (!hVar.h(12) && (b2 = h.b(hVar)) != null) {
                    obtain2.setContentDescription(b2);
                }
                String str3 = hVar.f15182z;
                if (str3 != null) {
                    obtain2.setTooltipText(str3);
                }
                boolean h2 = hVar.h(1);
                boolean h4 = hVar.h(17);
                obtain2.setCheckable(h2 || h4);
                if (h2) {
                    obtain2.setChecked(hVar.h(2));
                    if (hVar.h(9)) {
                        obtain2.setClassName(StubApp.getString2(18924));
                    } else {
                        obtain2.setClassName(StubApp.getString2(18925));
                    }
                } else if (h4) {
                    obtain2.setChecked(hVar.h(18));
                    obtain2.setClassName(StubApp.getString2(18926));
                }
                obtain2.setSelected(hVar.h(3));
                obtain2.setHeading(hVar.h(10));
                h hVar7 = this.f15196i;
                if (hVar7 == null || hVar7.f15159b != i3) {
                    obtain2.addAction(64);
                } else {
                    obtain2.addAction(128);
                }
                ArrayList arrayList = hVar.f15150S;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(fVar.f15126a, fVar.f15129d));
                    }
                }
                Iterator it2 = hVar.f15148Q.iterator();
                while (it2.hasNext()) {
                    h hVar8 = (h) it2.next();
                    if (!hVar8.h(14)) {
                        int i17 = hVar8.f15166i;
                        if (i17 != -1) {
                            View platformViewById = platformViewsAccessibilityDelegate.getPlatformViewById(i17);
                            if (!platformViewsAccessibilityDelegate.usesVirtualDisplay(hVar8.f15166i)) {
                                obtain2.addChild(platformViewById);
                            }
                        }
                        obtain2.addChild(view, hVar8.f15159b);
                    }
                }
                return obtain2;
            }
            View platformViewById2 = platformViewsAccessibilityDelegate.getPlatformViewById(hVar.f15166i);
            if (platformViewById2 != null) {
                return accessibilityViewEmbedder.getRootNode(platformViewById2, hVar.f15159b, hVar.f15157Z);
            }
        }
        return null;
    }

    public final AccessibilityEvent d(int i3, int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        View view = this.f15188a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i3);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        h i3;
        if (this.f15190c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f15194g;
            if (!hashMap.isEmpty()) {
                h i10 = ((h) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
                if (i10 == null || i10.f15166i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x7 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i3 = ((h) hashMap.get(0)).i(new float[]{x7, y10, 0.0f, 1.0f}, z2)) != this.f15201o) {
                            if (i3 != null) {
                                g(i3.f15159b, 128);
                            }
                            h hVar = this.f15201o;
                            if (hVar != null) {
                                g(hVar.f15159b, 256);
                            }
                            this.f15201o = i3;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f15201o;
                        if (hVar2 != null) {
                            g(hVar2.f15159b, 256);
                            this.f15201o = null;
                        }
                    }
                    return true;
                }
                if (!z2) {
                    return this.f15191d.onAccessibilityHoverEvent(i10.f15159b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(h hVar, int i3, Bundle bundle, boolean z2) {
        int i10;
        int i11 = bundle.getInt(StubApp.getString2(18927));
        boolean z10 = bundle.getBoolean(StubApp.getString2(18928));
        int i12 = hVar.f15164g;
        int i13 = hVar.f15165h;
        if (i13 >= 0 && i12 >= 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8 || i11 == 16) {
                            if (z2) {
                                hVar.f15165h = hVar.f15174r.length();
                            } else {
                                hVar.f15165h = 0;
                            }
                        }
                    } else if (z2 && i13 < hVar.f15174r.length()) {
                        Matcher matcher = Pattern.compile(StubApp.getString2(18929)).matcher(hVar.f15174r.substring(hVar.f15165h));
                        if (matcher.find()) {
                            hVar.f15165h += matcher.start(1);
                        } else {
                            hVar.f15165h = hVar.f15174r.length();
                        }
                    } else if (!z2 && hVar.f15165h > 0) {
                        Matcher matcher2 = Pattern.compile(StubApp.getString2(18930)).matcher(hVar.f15174r.substring(0, hVar.f15165h));
                        if (matcher2.find()) {
                            hVar.f15165h = matcher2.start(1);
                        } else {
                            hVar.f15165h = 0;
                        }
                    }
                } else if (z2 && i13 < hVar.f15174r.length()) {
                    Matcher matcher3 = Pattern.compile(StubApp.getString2(18931)).matcher(hVar.f15174r.substring(hVar.f15165h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f15165h += matcher3.start(1);
                    } else {
                        hVar.f15165h = hVar.f15174r.length();
                    }
                } else if (!z2 && hVar.f15165h > 0) {
                    Matcher matcher4 = Pattern.compile(StubApp.getString2(18932)).matcher(hVar.f15174r.substring(0, hVar.f15165h));
                    if (matcher4.find()) {
                        hVar.f15165h = matcher4.start(1);
                    }
                }
            } else if (z2 && i13 < hVar.f15174r.length()) {
                hVar.f15165h++;
            } else if (!z2 && (i10 = hVar.f15165h) > 0) {
                hVar.f15165h = i10 - 1;
            }
            if (!z10) {
                hVar.f15164g = hVar.f15165h;
            }
        }
        if (i12 != hVar.f15164g || i13 != hVar.f15165h) {
            String str = hVar.f15174r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d8 = d(hVar.f15159b, 8192);
            d8.getText().add(str);
            d8.setFromIndex(hVar.f15164g);
            d8.setToIndex(hVar.f15165h);
            d8.setItemCount(str.length());
            h(d8);
        }
        C0973b c0973b = this.f15189b;
        if (i11 == 1) {
            if (z2) {
                e eVar = e.f15112l;
                if (h.a(hVar, eVar)) {
                    c0973b.b(i3, eVar, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (!z2) {
                e eVar2 = e.f15113m;
                if (h.a(hVar, eVar2)) {
                    c0973b.b(i3, eVar2, Boolean.valueOf(z10));
                    return true;
                }
            }
        } else if (i11 == 2) {
            if (z2) {
                e eVar3 = e.f15122x;
                if (h.a(hVar, eVar3)) {
                    c0973b.b(i3, eVar3, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (!z2) {
                e eVar4 = e.f15123y;
                if (h.a(hVar, eVar4)) {
                    c0973b.b(i3, eVar4, Boolean.valueOf(z10));
                    return true;
                }
            }
        } else if (i11 == 4 || i11 == 8 || i11 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        if (i3 == 1) {
            h hVar = this.f15199m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f15159b);
            }
            Integer num = this.f15197k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i3 != 2) {
            return null;
        }
        h hVar2 = this.f15196i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f15159b);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i3, int i10) {
        if (this.f15190c.isEnabled()) {
            h(d(i3, i10));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f15190c.isEnabled()) {
            View view = this.f15188a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f15206t == z2) {
            return;
        }
        this.f15206t = z2;
        if (z2) {
            this.f15198l |= 1;
        } else {
            this.f15198l &= -2;
        }
        this.f15189b.f14324b.setAccessibilityFeatures(this.f15198l);
    }

    public final boolean j(h hVar) {
        if (hVar.j <= 0) {
            return false;
        }
        h hVar2 = this.f15196i;
        h hVar3 = null;
        if (hVar2 != null) {
            h hVar4 = hVar2.f15147P;
            while (true) {
                if (hVar4 == null) {
                    hVar4 = null;
                    break;
                }
                if (hVar4 == hVar) {
                    break;
                }
                hVar4 = hVar4.f15147P;
            }
            if (hVar4 != null) {
                return true;
            }
        }
        h hVar5 = this.f15196i;
        if (hVar5 == null) {
            return true;
        }
        h hVar6 = hVar5.f15147P;
        while (true) {
            if (hVar6 == null) {
                break;
            }
            if (hVar6.h(19)) {
                hVar3 = hVar6;
                break;
            }
            hVar6 = hVar6.f15147P;
        }
        return hVar3 == null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i10, Bundle bundle) {
        String str;
        if (i3 >= 65536) {
            boolean performAction = this.f15191d.performAction(i3, i10, bundle);
            if (performAction && i10 == 128) {
                this.j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f15194g;
        h hVar = (h) hashMap.get(Integer.valueOf(i3));
        if (hVar != null) {
            e eVar = e.f15110h;
            e eVar2 = e.j;
            C0973b c0973b = this.f15189b;
            switch (i10) {
                case 16:
                    c0973b.a(i3, e.f15104b);
                    return true;
                case 32:
                    c0973b.a(i3, e.f15105c);
                    return true;
                case 64:
                    if (this.f15196i == null) {
                        this.f15188a.invalidate();
                    }
                    this.f15196i = hVar;
                    c0973b.a(i3, e.f15118s);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(StubApp.getString2(660), StubApp.getString2(18938));
                    hashMap2.put(StubApp.getString2(17873), Integer.valueOf(hVar.f15159b));
                    c0973b.f14323a.send(hashMap2);
                    g(i3, 32768);
                    if (!h.a(hVar, eVar) && !h.a(hVar, eVar2)) {
                        return true;
                    }
                    g(i3, 4);
                    return true;
                case 128:
                    h hVar2 = this.f15196i;
                    if (hVar2 != null && hVar2.f15159b == i3) {
                        this.f15196i = null;
                    }
                    Integer num = this.j;
                    if (num != null && num.intValue() == i3) {
                        this.j = null;
                    }
                    c0973b.a(i3, e.f15119t);
                    g(i3, PKIFailureInfo.notAuthorized);
                    return true;
                case 256:
                    return f(hVar, i3, bundle, true);
                case 512:
                    return f(hVar, i3, bundle, false);
                case 4096:
                    e eVar3 = e.f15108f;
                    if (h.a(hVar, eVar3)) {
                        c0973b.a(i3, eVar3);
                        return true;
                    }
                    e eVar4 = e.f15106d;
                    if (h.a(hVar, eVar4)) {
                        c0973b.a(i3, eVar4);
                        return true;
                    }
                    if (h.a(hVar, eVar)) {
                        hVar.f15174r = hVar.f15176t;
                        hVar.f15175s = hVar.f15177u;
                        g(i3, 4);
                        c0973b.a(i3, eVar);
                        return true;
                    }
                    break;
                case 8192:
                    e eVar5 = e.f15109g;
                    if (h.a(hVar, eVar5)) {
                        c0973b.a(i3, eVar5);
                        return true;
                    }
                    e eVar6 = e.f15107e;
                    if (h.a(hVar, eVar6)) {
                        c0973b.a(i3, eVar6);
                        return true;
                    }
                    if (h.a(hVar, eVar2)) {
                        hVar.f15174r = hVar.f15178v;
                        hVar.f15175s = hVar.f15179w;
                        g(i3, 4);
                        c0973b.a(i3, eVar2);
                        return true;
                    }
                    break;
                case 16384:
                    c0973b.a(i3, e.f15115p);
                    return true;
                case 32768:
                    c0973b.a(i3, e.f15117r);
                    return true;
                case PKIFailureInfo.notAuthorized /* 65536 */:
                    c0973b.a(i3, e.f15116q);
                    return true;
                case PKIFailureInfo.unsupportedVersion /* 131072 */:
                    HashMap hashMap3 = new HashMap();
                    String string2 = StubApp.getString2(18934);
                    String string22 = StubApp.getString2(18935);
                    if (bundle != null) {
                        String string23 = StubApp.getString2(18936);
                        if (bundle.containsKey(string23)) {
                            String string24 = StubApp.getString2(18937);
                            if (bundle.containsKey(string24)) {
                                hashMap3.put(string22, Integer.valueOf(bundle.getInt(string23)));
                                hashMap3.put(string2, Integer.valueOf(bundle.getInt(string24)));
                                c0973b.b(i3, e.f15114n, hashMap3);
                                h hVar3 = (h) hashMap.get(Integer.valueOf(i3));
                                hVar3.f15164g = ((Integer) hashMap3.get(string22)).intValue();
                                hVar3.f15165h = ((Integer) hashMap3.get(string2)).intValue();
                                return true;
                            }
                        }
                    }
                    hashMap3.put(string22, Integer.valueOf(hVar.f15165h));
                    hashMap3.put(string2, Integer.valueOf(hVar.f15165h));
                    c0973b.b(i3, e.f15114n, hashMap3);
                    h hVar32 = (h) hashMap.get(Integer.valueOf(i3));
                    hVar32.f15164g = ((Integer) hashMap3.get(string22)).intValue();
                    hVar32.f15165h = ((Integer) hashMap3.get(string2)).intValue();
                    return true;
                case PKIFailureInfo.badCertTemplate /* 1048576 */:
                    c0973b.a(i3, e.f15121w);
                    return true;
                case PKIFailureInfo.badSenderNonce /* 2097152 */:
                    if (bundle != null) {
                        String string25 = StubApp.getString2(18933);
                        if (bundle.containsKey(string25)) {
                            str = bundle.getString(string25);
                            c0973b.b(i3, e.f15124z, str);
                            hVar.f15174r = str;
                            hVar.f15175s = null;
                            return true;
                        }
                    }
                    str = "";
                    c0973b.b(i3, e.f15124z, str);
                    hVar.f15174r = str;
                    hVar.f15175s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    c0973b.a(i3, e.f15111k);
                    return true;
                default:
                    f fVar = (f) this.f15195h.get(Integer.valueOf(i10 - 267386881));
                    if (fVar != null) {
                        c0973b.b(i3, e.f15120v, Integer.valueOf(fVar.f15127b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
