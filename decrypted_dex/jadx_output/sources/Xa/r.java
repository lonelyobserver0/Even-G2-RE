package Xa;

import Qb.C0206l0;
import Qb.InterfaceC0221t0;
import Qb.J;
import Qb.L;
import Qb.W;
import Tb.C0322c;
import Tb.InterfaceC0327h;
import Tb.Q;
import a2.C0390a;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import c2.C0550b;
import c2.C0551c;
import c2.C0555g;
import c2.C0557i;
import c2.C0558j;
import c2.InterfaceC0556h;
import com.stub.StubApp;
import gb.C0973b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.mouse.MouseCursorPlugin;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends FrameLayout implements MouseCursorPlugin.MouseCursorViewDelegate, y {

    /* renamed from: A, reason: collision with root package name */
    public s f8567A;

    /* renamed from: a, reason: collision with root package name */
    public final l f8568a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8569b;

    /* renamed from: c, reason: collision with root package name */
    public j f8570c;

    /* renamed from: d, reason: collision with root package name */
    public View f8571d;

    /* renamed from: e, reason: collision with root package name */
    public View f8572e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f8573f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8574g;

    /* renamed from: h, reason: collision with root package name */
    public Ya.c f8575h;
    public final HashSet j;

    /* renamed from: k, reason: collision with root package name */
    public MouseCursorPlugin f8576k;

    /* renamed from: l, reason: collision with root package name */
    public TextInputPlugin f8577l;

    /* renamed from: m, reason: collision with root package name */
    public SpellCheckPlugin f8578m;

    /* renamed from: n, reason: collision with root package name */
    public LocalizationPlugin f8579n;

    /* renamed from: p, reason: collision with root package name */
    public z f8580p;

    /* renamed from: q, reason: collision with root package name */
    public C0361a f8581q;

    /* renamed from: r, reason: collision with root package name */
    public io.flutter.view.l f8582r;

    /* renamed from: s, reason: collision with root package name */
    public TextServicesManager f8583s;

    /* renamed from: t, reason: collision with root package name */
    public F5.c f8584t;

    /* renamed from: v, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f8585v;

    /* renamed from: w, reason: collision with root package name */
    public final s2.d f8586w;

    /* renamed from: x, reason: collision with root package name */
    public final p f8587x;

    /* renamed from: y, reason: collision with root package name */
    public final C0365e f8588y;

    /* renamed from: z, reason: collision with root package name */
    public o f8589z;

    public r(AbstractActivityC0364d abstractActivityC0364d, l lVar) {
        super(abstractActivityC0364d, null);
        this.f8573f = new HashSet();
        this.j = new HashSet();
        this.f8585v = new io.flutter.embedding.engine.renderer.k();
        this.f8586w = new s2.d(this, 23);
        this.f8587x = new p(this, new Handler(Looper.getMainLooper()), 0);
        this.f8588y = new C0365e(this, 2);
        this.f8567A = new s();
        this.f8568a = lVar;
        this.f8571d = lVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void a() {
        Objects.toString(this.f8575h);
        if (c()) {
            Iterator it = this.j.iterator();
            if (it.hasNext()) {
                throw com.mapbox.common.b.e(it);
            }
            getContext().getContentResolver().unregisterContentObserver(this.f8587x);
            this.f8575h.f8877r.detachFromView();
            this.f8575h.f8878s.detachFromView();
            this.f8575h.f8877r.detachAccessibilityBridge();
            this.f8575h.f8878s.detachAccessibilityBridge();
            io.flutter.view.l lVar = this.f8582r;
            lVar.f15207u = true;
            lVar.f15192e.detachAccessibilityBridge();
            lVar.f15205s = null;
            AccessibilityManager accessibilityManager = lVar.f15190c;
            accessibilityManager.removeAccessibilityStateChangeListener(lVar.f15209w);
            accessibilityManager.removeTouchExplorationStateChangeListener(lVar.f15210x);
            lVar.f15193f.unregisterContentObserver(lVar.f15211y);
            C0973b c0973b = lVar.f15189b;
            c0973b.f14325c = null;
            c0973b.f14324b.setAccessibilityDelegate(null);
            this.f8582r = null;
            this.f8577l.getInputMethodManager().restartInput(this);
            this.f8577l.destroy();
            int size = this.f8580p.f8608b.size();
            if (size > 0) {
                Log.w(StubApp.getString2(7435), StubApp.getString2(7433) + String.valueOf(size) + StubApp.getString2(7434));
            }
            SpellCheckPlugin spellCheckPlugin = this.f8578m;
            if (spellCheckPlugin != null) {
                spellCheckPlugin.destroy();
            }
            MouseCursorPlugin mouseCursorPlugin = this.f8576k;
            if (mouseCursorPlugin != null) {
                mouseCursorPlugin.destroy();
            }
            io.flutter.embedding.engine.renderer.l lVar2 = this.f8575h.f8862b;
            this.f8574g = false;
            lVar2.f15057a.removeIsDisplayingFlutterUiListener(this.f8588y);
            lVar2.g();
            lVar2.f15057a.setSemanticsEnabled(false);
            View view = this.f8572e;
            if (view != null && this.f8571d == this.f8570c) {
                this.f8571d = view;
            }
            this.f8571d.detachFromRenderer();
            j jVar = this.f8570c;
            if (jVar != null) {
                jVar.closeImageReader();
                removeView(this.f8570c);
                this.f8570c = null;
            }
            this.f8572e = null;
            this.f8575h = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        this.f8577l.autofill(sparseArray);
    }

    public final void b() {
        l lVar = this.f8568a;
        if (lVar != null) {
            addView(lVar);
        } else {
            n nVar = this.f8569b;
            if (nVar != null) {
                addView(nVar);
            } else {
                addView(this.f8570c);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final boolean c() {
        Ya.c cVar = this.f8575h;
        if (cVar != null) {
            return cVar.f8862b == this.f8571d.getAttachedRenderer();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        Ya.c cVar = this.f8575h;
        return cVar != null ? cVar.f8877r.checkInputConnectionProxy(view) : super.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa.r.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f8580p.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w(StubApp.getString2(7365), StubApp.getString2(7445));
            return;
        }
        float f10 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.k kVar = this.f8585v;
        kVar.f15040a = f10;
        kVar.f15054p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.l lVar = this.f8575h.f8862b;
        lVar.getClass();
        if (kVar.f15041b <= 0 || kVar.f15042c <= 0 || kVar.f15040a <= 0.0f) {
            return;
        }
        ArrayList arrayList = kVar.f15055q;
        arrayList.size();
        ArrayList arrayList2 = kVar.f15056r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i3);
            int i10 = i3 * 4;
            Rect rect = cVar.f15022a;
            iArr[i10] = rect.left;
            iArr[i10 + 1] = rect.top;
            iArr[i10 + 2] = rect.right;
            iArr[i10 + 3] = rect.bottom;
            iArr2[i3] = AbstractC1856e.c(cVar.f15023b);
            iArr3[i3] = AbstractC1856e.c(cVar.f15024c);
        }
        int size2 = arrayList.size() * 4;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i11);
            int i12 = (i11 * 4) + size2;
            Rect rect2 = cVar2.f15022a;
            iArr[i12] = rect2.left;
            iArr[i12 + 1] = rect2.top;
            iArr[i12 + 2] = rect2.right;
            iArr[i12 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i11] = AbstractC1856e.c(cVar2.f15023b);
            iArr3[arrayList.size() + i11] = AbstractC1856e.c(cVar2.f15024c);
        }
        lVar.f15057a.setViewportMetrics(kVar.f15040a, kVar.f15041b, kVar.f15042c, kVar.f15043d, kVar.f15044e, kVar.f15045f, kVar.f15046g, kVar.f15047h, kVar.f15048i, kVar.j, kVar.f15049k, kVar.f15050l, kVar.f15051m, kVar.f15052n, kVar.f15053o, kVar.f15054p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.l lVar = this.f8582r;
        if (lVar == null || !lVar.f15190c.isEnabled()) {
            return null;
        }
        return this.f8582r;
    }

    public Ya.c getAttachedFlutterEngine() {
        return this.f8575h;
    }

    public BinaryMessenger getBinaryMessenger() {
        return this.f8575h.f8863c;
    }

    public j getCurrentImageSurface() {
        return this.f8570c;
    }

    @Override // io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate
    public final PointerIcon getSystemPointerIcon(int i3) {
        return PointerIcon.getSystemIcon(getContext(), i3);
    }

    public io.flutter.embedding.engine.renderer.k getViewportMetrics() {
        return this.f8585v;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r15) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa.r.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        F5.c cVar;
        String string2 = StubApp.getString2(2680);
        super.onAttachedToWindow();
        try {
            C0555g c0555g = InterfaceC0556h.f10799S;
            Context context = getContext();
            c0555g.getClass();
            cVar = new F5.c(new Y.m(C0555g.a(context)), 27);
        } catch (NoClassDefFoundError unused) {
            cVar = null;
        }
        this.f8584t = cVar;
        Activity o5 = a4.f.o(getContext());
        F5.c cVar2 = this.f8584t;
        if (cVar2 == null || o5 == null) {
            return;
        }
        this.f8589z = new o(this, 0);
        Executor executor = getContext().getMainExecutor();
        o consumer = this.f8589z;
        Y.m mVar = (Y.m) cVar2.f2238b;
        Intrinsics.checkNotNullParameter(o5, string2);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        C0550b c0550b = (C0550b) mVar.f8674b;
        c0550b.getClass();
        Intrinsics.checkNotNullParameter(o5, string2);
        C0322c e10 = Q.e(new C0557i(c0550b, o5, null));
        Xb.d dVar = W.f5838a;
        InterfaceC0327h flow = Q.k(e10, Vb.q.f7968a);
        Y.m mVar2 = (Y.m) mVar.f8675c;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) mVar2.f8674b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) mVar2.f8675c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, L.j(J.a(new C0206l0(executor)), null, new C0390a(flow, consumer, null), 3));
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f8575h != null) {
            this.f8579n.sendLocalesToFlutter(configuration);
            d();
            a4.f.d(getContext(), this.f8575h);
        }
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !c() ? super.onCreateInputConnection(editorInfo) : this.f8577l.createInputConnection(this, this.f8580p, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o consumer;
        F5.c cVar = this.f8584t;
        if (cVar != null && (consumer = this.f8589z) != null) {
            Y.m mVar = (Y.m) cVar.f2238b;
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Y.m mVar2 = (Y.m) mVar.f8675c;
            mVar2.getClass();
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            ReentrantLock reentrantLock = (ReentrantLock) mVar2.f8674b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) mVar2.f8675c;
            try {
                InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) linkedHashMap.get(consumer);
                if (interfaceC0221t0 != null) {
                    interfaceC0221t0.d(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f8589z = null;
        this.f8584t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0361a c0361a = this.f8581q;
            Context context = getContext();
            c0361a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0361a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0361a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0361a.f8518e, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError(StubApp.getString2(7446));
                }
                c0361a.f8519a.f15057a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f8582r.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        this.f8577l.onProvideAutofillVirtualStructure(viewStructure, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        io.flutter.embedding.engine.renderer.k kVar = this.f8585v;
        kVar.f15041b = i3;
        kVar.f15042c = i10;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f8581q.c(motionEvent, C0361a.f8518e);
        return true;
    }

    public void setDelegate(s sVar) {
        this.f8567A = sVar;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f8571d;
        if (view instanceof l) {
            ((l) view).setVisibility(i3);
        }
    }

    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(C0558j c0558j) {
        List<C0551c> list = c0558j.f10804a;
        ArrayList arrayList = new ArrayList();
        for (C0551c c0551c : list) {
            c0551c.f10787a.a().toString();
            Z1.b bVar = c0551c.f10787a;
            int i3 = bVar.f8947c - bVar.f8945a;
            C0550b c0550b = C0550b.f10780d;
            int i10 = 2;
            int i11 = ((i3 == 0 || bVar.f8948d - bVar.f8946b == 0) ? C0550b.f10779c : c0550b) == c0550b ? 3 : 2;
            C0550b c0550b2 = C0550b.f10781e;
            C0550b c0550b3 = c0551c.f10789c;
            if (c0550b3 != c0550b2) {
                i10 = c0550b3 == C0550b.f10782f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.a(), i11, i10));
        }
        ArrayList arrayList2 = this.f8585v.f15055q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public r(AbstractActivityC0364d abstractActivityC0364d, n nVar) {
        super(abstractActivityC0364d, null);
        this.f8573f = new HashSet();
        this.j = new HashSet();
        this.f8585v = new io.flutter.embedding.engine.renderer.k();
        this.f8586w = new s2.d(this, 23);
        this.f8587x = new p(this, new Handler(Looper.getMainLooper()), 0);
        this.f8588y = new C0365e(this, 2);
        this.f8567A = new s();
        this.f8569b = nVar;
        this.f8571d = nVar;
        b();
    }
}
