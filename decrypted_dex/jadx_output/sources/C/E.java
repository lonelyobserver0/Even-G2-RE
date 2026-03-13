package C;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1560u;
import r0.C1552m;
import r0.C1553n;
import r0.C1558s;
import z1.C1992D;
import z1.C1993E;
import z1.C1994F;
import z1.InterfaceC1990B;
import z1.InterfaceC1995G;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E implements InterfaceC1990B {

    /* renamed from: a, reason: collision with root package name */
    public int f784a;

    /* renamed from: b, reason: collision with root package name */
    public Object f785b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f786c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f787d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f788e;

    public E() {
        this.f784a = 5;
        this.f786c = new ArrayDeque();
        this.f787d = new ArrayDeque();
        this.f788e = new ArrayDeque();
    }

    public void a(C0030g c0030g) {
        IconCompat a3 = c0030g.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(a3 != null ? a3.h(null) : null, c0030g.f842i, c0030g.j);
        M[] mArr = c0030g.f836c;
        if (mArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[mArr.length];
            for (int i3 = 0; i3 < mArr.length; i3++) {
                M m4 = mArr[i3];
                m4.getClass();
                RemoteInput.Builder addExtras = new RemoteInput.Builder(StubApp.getString2(743)).setLabel(m4.f818a).setChoices(m4.f819b).setAllowFreeFormInput(m4.f820c).addExtras(m4.f821d);
                Iterator it = m4.f822e.iterator();
                while (it.hasNext()) {
                    addExtras.setAllowDataType((String) it.next(), true);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0027d.e(addExtras);
                }
                remoteInputArr[i3] = addExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = c0030g.f834a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z2 = c0030g.f837d;
        bundle2.putBoolean(StubApp.getString2(741), z2);
        int i10 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z2);
        String string2 = StubApp.getString2(753);
        int i11 = c0030g.f839f;
        bundle2.putInt(string2, i11);
        builder.setSemanticAction(i11);
        if (i10 >= 29) {
            AbstractC0027d.d(builder, c0030g.f840g);
        }
        if (i10 >= 31) {
            D.a(builder);
        }
        bundle2.putBoolean(StubApp.getString2(754), c0030g.f838e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.f786c).addAction(builder.build());
    }

    @Override // z1.InterfaceC1990B
    public void b(C1558s c1558s, T0.q qVar, C1994F c1994f) {
    }

    @Override // z1.InterfaceC1990B
    public void c(C1553n c1553n) {
        C1558s c1558s;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        C1558s c1558s2;
        int i3;
        int i10;
        char c10;
        C1558s c1558s3;
        int i11;
        int i12;
        if (c1553n.u() != 2) {
            return;
        }
        C1992D c1992d = (C1992D) this.f788e;
        int i13 = c1992d.f23730a;
        int i14 = 0;
        List list = c1992d.f23732c;
        if (i13 == 1 || i13 == 2 || c1992d.f23742n == 1) {
            c1558s = (C1558s) list.get(0);
        } else {
            c1558s = new C1558s(((C1558s) list.get(0)).d());
            list.add(c1558s);
        }
        if ((c1553n.u() & 128) == 0) {
            return;
        }
        c1553n.H(1);
        int A4 = c1553n.A();
        int i15 = 3;
        c1553n.H(3);
        T0.J j = (T0.J) this.f785b;
        c1553n.f(0, 2, j.f6949b);
        j.q(0);
        j.t(3);
        c1992d.f23748t = j.i(13);
        c1553n.f(0, 2, j.f6949b);
        j.q(0);
        j.t(4);
        c1553n.H(j.i(12));
        K.i iVar = c1992d.f23735f;
        int i16 = c1992d.f23730a;
        if (i16 == 2 && c1992d.f23746r == null) {
            InterfaceC1995G a3 = iVar.a(21, new C1552m(21, null, 0, null, AbstractC1560u.f20195f));
            c1992d.f23746r = a3;
            if (a3 != null) {
                a3.b(c1558s, c1992d.f23741m, new C1994F(A4, 21, 8192));
            }
        }
        SparseArray sparseArray2 = (SparseArray) this.f786c;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f787d;
        sparseIntArray.clear();
        int a9 = c1553n.a();
        while (true) {
            sparseBooleanArray = c1992d.f23738i;
            if (a9 <= 0) {
                break;
            }
            c1553n.f(i14, 5, j.f6949b);
            j.q(i14);
            int i17 = j.i(8);
            j.t(i15);
            int i18 = j.i(13);
            j.t(4);
            int i19 = j.i(12);
            int i20 = c1553n.f20177b;
            int i21 = i20 + i19;
            String str = null;
            ArrayList arrayList = null;
            int i22 = -1;
            int i23 = 0;
            T0.J j3 = j;
            while (true) {
                if (c1553n.f20177b >= i21) {
                    i10 = a9;
                    break;
                }
                int u2 = c1553n.u();
                i10 = a9;
                int u10 = c1553n.f20177b + c1553n.u();
                if (u10 > i21) {
                    break;
                }
                if (u2 == 5) {
                    long w10 = c1553n.w();
                    if (w10 == 1094921523) {
                        i22 = 129;
                    } else if (w10 == 1161904947) {
                        i22 = 135;
                    } else {
                        if (w10 != 1094921524) {
                            if (w10 == 1212503619) {
                                i22 = 36;
                            }
                        }
                        i22 = 172;
                    }
                    c1558s3 = c1558s;
                    i11 = A4;
                    i12 = u10;
                } else if (u2 == 106) {
                    c1558s3 = c1558s;
                    i11 = A4;
                    i12 = u10;
                    i22 = 129;
                } else if (u2 == 122) {
                    c1558s3 = c1558s;
                    i11 = A4;
                    i22 = 135;
                    i12 = u10;
                } else {
                    if (u2 == 127) {
                        int u11 = c1553n.u();
                        if (u11 != 21) {
                            if (u11 == 14) {
                                i22 = 136;
                            } else if (u11 == 33) {
                                i22 = 139;
                            }
                        }
                        i22 = 172;
                    } else if (u2 == 123) {
                        i22 = 138;
                    } else if (u2 == 10) {
                        String trim = c1553n.s(3, StandardCharsets.UTF_8).trim();
                        i23 = c1553n.u();
                        str = trim;
                    } else {
                        if (u2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (c1553n.f20177b < u10) {
                                String trim2 = c1553n.s(3, StandardCharsets.UTF_8).trim();
                                c1553n.u();
                                C1558s c1558s4 = c1558s;
                                byte[] bArr = new byte[4];
                                c1553n.f(0, 4, bArr);
                                arrayList2.add(new C1993E(trim2, bArr));
                                c1558s = c1558s4;
                                u10 = u10;
                                A4 = A4;
                            }
                            c1558s3 = c1558s;
                            i11 = A4;
                            i12 = u10;
                            arrayList = arrayList2;
                            i22 = 89;
                        } else {
                            c1558s3 = c1558s;
                            i11 = A4;
                            i12 = u10;
                            if (u2 == 111) {
                                i22 = 257;
                            }
                        }
                        c1553n.H(i12 - c1553n.f20177b);
                        c1558s = c1558s3;
                        a9 = i10;
                        A4 = i11;
                    }
                    c1558s3 = c1558s;
                    i11 = A4;
                    i12 = u10;
                }
                c1553n.H(i12 - c1553n.f20177b);
                c1558s = c1558s3;
                a9 = i10;
                A4 = i11;
            }
            C1558s c1558s5 = c1558s;
            int i24 = A4;
            c1553n.G(i21);
            C1552m c1552m = new C1552m(i22, str, i23, arrayList, Arrays.copyOfRange(c1553n.f20176a, i20, i21));
            if (i17 == 6 || i17 == 5) {
                i17 = i22;
            }
            int i25 = i10 - (i19 + 5);
            int i26 = i16 == 2 ? i17 : i18;
            if (sparseBooleanArray.get(i26)) {
                c10 = 21;
            } else {
                c10 = 21;
                InterfaceC1995G a10 = (i16 == 2 && i17 == 21) ? c1992d.f23746r : iVar.a(i17, c1552m);
                if (i16 != 2 || i18 < sparseIntArray.get(i26, 8192)) {
                    sparseIntArray.put(i26, i18);
                    sparseArray2.put(i26, a10);
                }
            }
            a9 = i25;
            c1558s = c1558s5;
            j = j3;
            A4 = i24;
            i14 = 0;
            i15 = 3;
        }
        C1558s c1558s6 = c1558s;
        int i27 = A4;
        int size = sparseIntArray.size();
        int i28 = 0;
        while (true) {
            sparseArray = c1992d.f23737h;
            if (i28 >= size) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i28);
            int valueAt = sparseIntArray.valueAt(i28);
            sparseBooleanArray.put(keyAt, true);
            c1992d.j.put(valueAt, true);
            InterfaceC1995G interfaceC1995G = (InterfaceC1995G) sparseArray2.valueAt(i28);
            if (interfaceC1995G != null) {
                if (interfaceC1995G != c1992d.f23746r) {
                    T0.q qVar = c1992d.f23741m;
                    i3 = i27;
                    C1994F c1994f = new C1994F(i3, keyAt, 8192);
                    c1558s2 = c1558s6;
                    interfaceC1995G.b(c1558s2, qVar, c1994f);
                } else {
                    c1558s2 = c1558s6;
                    i3 = i27;
                }
                sparseArray.put(valueAt, interfaceC1995G);
            } else {
                c1558s2 = c1558s6;
                i3 = i27;
            }
            i28++;
            c1558s6 = c1558s2;
            i27 = i3;
        }
        if (i16 == 2) {
            if (c1992d.f23743o) {
                return;
            }
            c1992d.f23741m.q();
            c1992d.f23742n = 0;
            c1992d.f23743o = true;
            return;
        }
        sparseArray.remove(this.f784a);
        int i29 = i16 == 1 ? 0 : c1992d.f23742n - 1;
        c1992d.f23742n = i29;
        if (i29 == 0) {
            c1992d.f23741m.q();
            c1992d.f23743o = true;
        }
    }

    public synchronized void d() {
        try {
            Iterator it = ((ArrayDeque) this.f786c).iterator();
            while (it.hasNext()) {
                ((Ac.g) it.next()).f331c.d();
            }
            Iterator it2 = ((ArrayDeque) this.f787d).iterator();
            while (it2.hasNext()) {
                ((Ac.g) it2.next()).f331c.d();
            }
            Iterator it3 = ((ArrayDeque) this.f788e).iterator();
            while (it3.hasNext()) {
                ((Ac.j) it3.next()).d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ExecutorService e() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f785b) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = Intrinsics.stringPlus(xc.b.f23184f, " Dispatcher");
                Intrinsics.checkNotNullParameter(name, "name");
                this.f785b = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, timeUnit, synchronousQueue, new xc.a(name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f785b;
            Intrinsics.checkNotNull(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void f(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError(StubApp.getString2("755"));
            }
            synchronized (this) {
            }
            h();
        }
        Unit unit = Unit.INSTANCE;
        h();
    }

    public void g(Ac.g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f330b.decrementAndGet();
        f((ArrayDeque) this.f787d, call);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r3 < r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        r1.remove();
        r2.f330b.incrementAndGet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "asyncCall");
        r0.add(r2);
        ((java.util.ArrayDeque) r8.f787d).add(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r8 = this;
            byte[] r0 = xc.b.f23179a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.f786c     // Catch: java.lang.Throwable -> L55
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L55
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L55
            Ac.g r2 = (Ac.g) r2     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = r8.f787d     // Catch: java.lang.Throwable -> L55
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L55
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L55
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L55
            r4 = 64
            if (r3 < r4) goto L30
            goto L5a
        L30:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f330b     // Catch: java.lang.Throwable -> L55
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L55
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L55
            int r4 = r8.f784a     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L55
            if (r3 < r4) goto L3d
            goto L15
        L3d:
            r1.remove()     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f330b     // Catch: java.lang.Throwable -> L55
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "asyncCall"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L55
            r0.add(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = r8.f787d     // Catch: java.lang.Throwable -> L55
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L55
            r3.add(r2)     // Catch: java.lang.Throwable -> L55
            goto L15
        L55:
            r0 = move-exception
            goto Lc3
        L57:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L55
        L5a:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r8.f787d     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> Lc0
            r1.size()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r1 = r8.f788e     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> Lc0
            r1.size()     // Catch: java.lang.Throwable -> Lc0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L55
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L55
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L72:
            if (r2 >= r1) goto Lbf
            int r3 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            Ac.g r2 = (Ac.g) r2
            java.util.concurrent.ExecutorService r4 = r8.e()
            r2.getClass()
            java.lang.String r5 = "executorService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            Ac.j r5 = r2.f331c
            wc.x r6 = r5.f334a
            C.E r6 = r6.f22463a
            byte[] r6 = xc.b.f23179a
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L96 java.lang.Throwable -> Lb6
            r4.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L96 java.lang.Throwable -> Lb6
            goto Lb4
        L96:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = "756"
            java.lang.String r7 = com.stub.StubApp.getString2(r7)     // Catch: java.lang.Throwable -> Lb6
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb6
            r6.initCause(r4)     // Catch: java.lang.Throwable -> Lb6
            r5.j(r6)     // Catch: java.lang.Throwable -> Lb6
            wc.e r4 = r2.f329a     // Catch: java.lang.Throwable -> Lb6
            r4.onFailure(r5, r6)     // Catch: java.lang.Throwable -> Lb6
            wc.x r4 = r5.f334a
            C.E r4 = r4.f22463a
            r4.g(r2)
        Lb4:
            r2 = r3
            goto L72
        Lb6:
            r0 = move-exception
            wc.x r1 = r5.f334a
            C.E r1 = r1.f22463a
            r1.g(r2)
            throw r0
        Lbf:
            return
        Lc0:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> L55
        Lc3:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C.E.h():void");
    }

    public void i(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(StubApp.getString2(757), Integer.valueOf(i3)).toString());
        }
        synchronized (this) {
            this.f784a = i3;
            Unit unit = Unit.INSTANCE;
        }
        h();
    }

    public E(C0036m c0036m) {
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList;
        C0030g e10;
        C0030g e11;
        int i3;
        new ArrayList();
        this.f788e = new Bundle();
        this.f787d = c0036m;
        Context context = c0036m.f860a;
        this.f785b = context;
        Notification.Builder builder = new Notification.Builder(context, c0036m.f852D);
        this.f786c = builder;
        Notification notification = c0036m.f857I;
        Bundle[] bundleArr2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0036m.f864e).setContentText(c0036m.f865f).setContentInfo(null).setContentIntent(c0036m.f866g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0036m.f867h, (notification.flags & 128) != 0).setNumber(c0036m.j).setProgress(c0036m.f874p, c0036m.f875q, c0036m.f876r);
        IconCompat iconCompat = c0036m.f868i;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.h(context));
        builder.setSubText(c0036m.f873o).setUsesChronometer(c0036m.f871m).setPriority(c0036m.f869k);
        C c10 = c0036m.f872n;
        if (c10 instanceof s) {
            s sVar = (s) c10;
            PendingIntent pendingIntent = sVar.f888h;
            if (pendingIntent == null) {
                e10 = sVar.e(2131165322, 2131755044, sVar.f891l, 2131034158, sVar.f889i);
            } else {
                e10 = sVar.e(2131165322, 2131755043, sVar.f891l, 2131034158, pendingIntent);
            }
            PendingIntent pendingIntent2 = sVar.f887g;
            if (pendingIntent2 == null) {
                e11 = null;
            } else {
                boolean z2 = sVar.j;
                e11 = sVar.e(z2 ? 2131165320 : 2131165318, z2 ? 2131755042 : 2131755041, sVar.f890k, 2131034157, pendingIntent2);
            }
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(e10);
            ArrayList arrayList3 = sVar.f780a.f861b;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                i3 = 2;
                while (it.hasNext()) {
                    C0030g c0030g = (C0030g) it.next();
                    if (c0030g.f840g) {
                        arrayList2.add(c0030g);
                    } else {
                        if (!c0030g.f834a.getBoolean(StubApp.getString2(738)) && i3 > 1) {
                            arrayList2.add(c0030g);
                            i3--;
                        }
                    }
                    if (e11 != null && i3 == 1) {
                        arrayList2.add(e11);
                        i3--;
                    }
                }
            } else {
                i3 = 2;
            }
            if (e11 != null && i3 >= 1) {
                arrayList2.add(e11);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                a((C0030g) it2.next());
            }
        } else {
            Iterator it3 = c0036m.f861b.iterator();
            while (it3.hasNext()) {
                a((C0030g) it3.next());
            }
        }
        Bundle bundle2 = c0036m.f883y;
        if (bundle2 != null) {
            ((Bundle) this.f788e).putAll(bundle2);
        }
        ((Notification.Builder) this.f786c).setShowWhen(c0036m.f870l);
        ((Notification.Builder) this.f786c).setLocalOnly(c0036m.f879u);
        ((Notification.Builder) this.f786c).setGroup(c0036m.f877s);
        ((Notification.Builder) this.f786c).setSortKey(null);
        ((Notification.Builder) this.f786c).setGroupSummary(c0036m.f878t);
        this.f784a = c0036m.f855G;
        ((Notification.Builder) this.f786c).setCategory(c0036m.f882x);
        ((Notification.Builder) this.f786c).setColor(c0036m.f884z);
        ((Notification.Builder) this.f786c).setVisibility(c0036m.f849A);
        ((Notification.Builder) this.f786c).setPublicVersion(null);
        ((Notification.Builder) this.f786c).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = c0036m.f859K;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((Notification.Builder) this.f786c).addPerson((String) it4.next());
            }
        }
        ArrayList arrayList5 = c0036m.f863d;
        if (arrayList5.size() > 0) {
            if (c0036m.f883y == null) {
                c0036m.f883y = new Bundle();
            }
            Bundle bundle3 = c0036m.f883y;
            String string2 = StubApp.getString2(739);
            Bundle bundle4 = bundle3.getBundle(string2);
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList5.size()) {
                String num = Integer.toString(i10);
                C0030g c0030g2 = (C0030g) arrayList5.get(i10);
                Bundle bundle7 = new Bundle();
                IconCompat a3 = c0030g2.a();
                bundle7.putInt(StubApp.getString2(727), a3 != null ? a3.f() : 0);
                bundle7.putCharSequence(StubApp.getString2(616), c0030g2.f842i);
                bundle7.putParcelable(StubApp.getString2(740), c0030g2.j);
                Bundle bundle8 = c0030g2.f834a;
                if (bundle8 != null) {
                    bundle = new Bundle(bundle8);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(StubApp.getString2(741), c0030g2.f837d);
                String string22 = StubApp.getString2(702);
                bundle7.putBundle(string22, bundle);
                M[] mArr = c0030g2.f836c;
                if (mArr == null) {
                    arrayList = arrayList5;
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[mArr.length];
                    arrayList = arrayList5;
                    int i11 = 0;
                    while (i11 < mArr.length) {
                        M m4 = mArr[i11];
                        int i12 = i11;
                        Bundle bundle9 = new Bundle();
                        m4.getClass();
                        M[] mArr2 = mArr;
                        Bundle[] bundleArr3 = bundleArr;
                        bundle9.putString(StubApp.getString2(742), StubApp.getString2(743));
                        bundle9.putCharSequence(StubApp.getString2(744), m4.f818a);
                        bundle9.putCharSequenceArray(StubApp.getString2(745), m4.f819b);
                        bundle9.putBoolean(StubApp.getString2(746), m4.f820c);
                        bundle9.putBundle(string22, m4.f821d);
                        HashSet hashSet = m4.f822e;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList6 = new ArrayList<>(hashSet.size());
                            Iterator it5 = hashSet.iterator();
                            while (it5.hasNext()) {
                                arrayList6.add((String) it5.next());
                            }
                            bundle9.putStringArrayList(StubApp.getString2(747), arrayList6);
                        }
                        bundleArr3[i12] = bundle9;
                        i11 = i12 + 1;
                        mArr = mArr2;
                        bundleArr = bundleArr3;
                    }
                }
                bundle7.putParcelableArray(StubApp.getString2(748), bundleArr);
                bundle7.putBoolean(StubApp.getString2(749), c0030g2.f838e);
                bundle7.putInt(StubApp.getString2(750), c0030g2.f839f);
                bundle6.putBundle(num, bundle7);
                i10++;
                arrayList5 = arrayList;
                bundleArr2 = null;
            }
            String string23 = StubApp.getString2(751);
            bundle4.putBundle(string23, bundle6);
            bundle5.putBundle(string23, bundle6);
            if (c0036m.f883y == null) {
                c0036m.f883y = new Bundle();
            }
            c0036m.f883y.putBundle(string2, bundle4);
            ((Bundle) this.f788e).putBundle(string2, bundle5);
        }
        ((Notification.Builder) this.f786c).setExtras(c0036m.f883y);
        ((Notification.Builder) this.f786c).setRemoteInputHistory(null);
        RemoteViews remoteViews = c0036m.f850B;
        if (remoteViews != null) {
            ((Notification.Builder) this.f786c).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = c0036m.f851C;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.f786c).setCustomBigContentView(remoteViews2);
        }
        ((Notification.Builder) this.f786c).setBadgeIconType(0);
        ((Notification.Builder) this.f786c).setSettingsText(null);
        ((Notification.Builder) this.f786c).setShortcutId(c0036m.f853E);
        ((Notification.Builder) this.f786c).setTimeoutAfter(c0036m.f854F);
        ((Notification.Builder) this.f786c).setGroupAlertBehavior(c0036m.f855G);
        if (c0036m.f881w) {
            ((Notification.Builder) this.f786c).setColorized(c0036m.f880v);
        }
        if (!TextUtils.isEmpty(c0036m.f852D)) {
            ((Notification.Builder) this.f786c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it6 = c0036m.f862c.iterator();
        while (it6.hasNext()) {
            ((Notification.Builder) this.f786c).addPerson(((K) it6.next()).c());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0027d.b((Notification.Builder) this.f786c, c0036m.f856H);
            AbstractC0027d.c((Notification.Builder) this.f786c);
        }
        if (c0036m.f858J) {
            if (((C0036m) this.f787d).f878t) {
                this.f784a = 2;
            } else {
                this.f784a = 1;
            }
            ((Notification.Builder) this.f786c).setVibrate(null);
            ((Notification.Builder) this.f786c).setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            ((Notification.Builder) this.f786c).setDefaults(i13);
            if (TextUtils.isEmpty(((C0036m) this.f787d).f877s)) {
                ((Notification.Builder) this.f786c).setGroup(StubApp.getString2(752));
            }
            ((Notification.Builder) this.f786c).setGroupAlertBehavior(this.f784a);
        }
    }

    public E(T0.z zVar, A0.c cVar, byte[] bArr, R4.b[] bVarArr, int i3) {
        this.f785b = zVar;
        this.f786c = cVar;
        this.f787d = bArr;
        this.f788e = bVarArr;
        this.f784a = i3;
    }

    public E(C1992D c1992d, int i3) {
        this.f788e = c1992d;
        this.f785b = new T0.J(new byte[5], 5);
        this.f786c = new SparseArray();
        this.f787d = new SparseIntArray();
        this.f784a = i3;
    }
}
