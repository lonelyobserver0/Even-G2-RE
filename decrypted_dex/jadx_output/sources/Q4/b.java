package Q4;

import Q2.g;
import X4.i;
import bb.d;
import com.google.android.gms.internal.measurement.B;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.stub.StubApp;
import java.util.Objects;
import l4.AbstractC1202o;
import l4.BinderC1212t0;
import l4.C1172e;
import l4.C1200n0;
import l4.C1204p;
import l4.E0;
import l4.InterfaceC1216v0;
import l4.P0;
import l4.ServiceConnectionC1167c0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5732a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5733b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5734c;

    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        this.f5732a = i3;
        this.f5733b = obj;
        this.f5734c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:21|(1:23)(9:266|267|268|269|(1:271)(2:292|(4:294|273|274|(24:276|(1:278)(1:290)|280|281|282|283|284|25|(2:27|(2:29|(2:31|(2:33|(2:35|(2:37|(1:39)(1:259))(1:260))(1:261))(1:262))(1:263))(1:264))(1:265)|40|41|42|(1:44)(1:256)|45|(1:47)|49|(1:51)(2:253|(7:255|(3:245|246|(1:248)(1:249))|(5:55|(1:57)(3:236|(3:239|(1:241)(1:242)|237)|243)|(1:59)(1:235)|60|(9:62|(1:64)(1:232)|65|(1:67)|68|(1:70)(1:231)|71|(1:73)|(32:229|75|(1:77)(1:227)|78|(2:224|(18:226|(1:95)|96|(1:98)|99|(2:200|(2:206|(2:214|(2:215|(1:222)(2:217|(2:219|220)(1:221))))(0))(1:205))(1:103)|104|(3:196|(1:198)|199)|108|(1:110)|111|(1:115)|116|(3:118|(7:120|(1:122)(1:137)|123|(1:125)|126|(4:130|(1:132)|133|(1:135))|136)|138)(9:156|(3:158|(2:161|(5:163|(1:165)(1:170)|166|(1:168)|169))|171)(1:195)|172|(1:174)|175|176|177|178|(5:180|(1:182)(1:190)|(1:186)|(1:188)|189))|139|(3:141|(1:143)(1:152)|(5:145|(1:147)|148|(1:150)|151))|153|154))(1:81)|82|(1:223)(1:92)|93|(0)|96|(0)|99|(1:101)|200|(1:203)|206|(5:208|210|212|214|(3:215|(0)(0)|221))(0)|104|(1:106)|196|(0)|199|108|(0)|111|(2:113|115)|116|(0)(0)|139|(0)|153|154)(33:230|78|(0)|224|(0)|82|(4:84|86|88|90)|223|93|(0)|96|(0)|99|(0)|200|(0)|206|(0)(0)|104|(0)|196|(0)|199|108|(0)|111|(0)|116|(0)(0)|139|(0)|153|154))(2:233|234))|244|(0)(0)|60|(0)(0)))|52|(0)|(0)|244|(0)(0)|60|(0)(0))))|272|273|274|(0))|24|25|(0)(0)|40|41|42|(0)(0)|45|(0)|49|(0)(0)|52|(0)|(0)|244|(0)(0)|60|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:266|267|268|269|(1:271)(2:292|(4:294|273|274|(24:276|(1:278)(1:290)|280|281|282|283|284|25|(2:27|(2:29|(2:31|(2:33|(2:35|(2:37|(1:39)(1:259))(1:260))(1:261))(1:262))(1:263))(1:264))(1:265)|40|41|42|(1:44)(1:256)|45|(1:47)|49|(1:51)(2:253|(7:255|(3:245|246|(1:248)(1:249))|(5:55|(1:57)(3:236|(3:239|(1:241)(1:242)|237)|243)|(1:59)(1:235)|60|(9:62|(1:64)(1:232)|65|(1:67)|68|(1:70)(1:231)|71|(1:73)|(32:229|75|(1:77)(1:227)|78|(2:224|(18:226|(1:95)|96|(1:98)|99|(2:200|(2:206|(2:214|(2:215|(1:222)(2:217|(2:219|220)(1:221))))(0))(1:205))(1:103)|104|(3:196|(1:198)|199)|108|(1:110)|111|(1:115)|116|(3:118|(7:120|(1:122)(1:137)|123|(1:125)|126|(4:130|(1:132)|133|(1:135))|136)|138)(9:156|(3:158|(2:161|(5:163|(1:165)(1:170)|166|(1:168)|169))|171)(1:195)|172|(1:174)|175|176|177|178|(5:180|(1:182)(1:190)|(1:186)|(1:188)|189))|139|(3:141|(1:143)(1:152)|(5:145|(1:147)|148|(1:150)|151))|153|154))(1:81)|82|(1:223)(1:92)|93|(0)|96|(0)|99|(1:101)|200|(1:203)|206|(5:208|210|212|214|(3:215|(0)(0)|221))(0)|104|(1:106)|196|(0)|199|108|(0)|111|(2:113|115)|116|(0)(0)|139|(0)|153|154)(33:230|78|(0)|224|(0)|82|(4:84|86|88|90)|223|93|(0)|96|(0)|99|(0)|200|(0)|206|(0)(0)|104|(0)|196|(0)|199|108|(0)|111|(0)|116|(0)(0)|139|(0)|153|154))(2:233|234))|244|(0)(0)|60|(0)(0)))|52|(0)|(0)|244|(0)(0)|60|(0)(0))))|272|273|274|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x030a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x030b, code lost:
    
        l4.C1200n0.l(r15);
        r15.f16242f.d(com.stub.StubApp.getString2(5189), l4.T.s(r8), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0210, code lost:
    
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04ce, code lost:
    
        if (r4.F() == 1) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0640 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x069b A[EDGE_INSN: B:222:0x069b->B:104:0x069b BREAK  A[LOOP:0: B:215:0x0686->B:221:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x035f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01ec A[Catch: NameNotFoundException -> 0x0210, TryCatch #4 {NameNotFoundException -> 0x0210, blocks: (B:274:0x01e1, B:276:0x01ec, B:278:0x01f8), top: B:273:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f7 A[Catch: IllegalStateException -> 0x030a, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x030a, blocks: (B:42:0x02e5, B:45:0x02f3, B:47:0x02f7), top: B:41:0x02e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05f8  */
    /* JADX WARN: Type inference failed for: r1v56, types: [l4.N0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            Method dump skipped, instructions count: 2515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.b.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f5733b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r10.f5733b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        X4.i.f8399f.log(java.util.logging.Level.SEVERE, com.stub.StubApp.getString2("5228") + ((java.lang.Runnable) r10.f5733b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f5734c     // Catch: java.lang.Throwable -> L58
            X4.i r2 = (X4.i) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f8401b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f5734c     // Catch: java.lang.Throwable -> L20
            X4.i r0 = (X4.i) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f8402c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L81
        L22:
            long r6 = r0.f8403d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f8403d = r6     // Catch: java.lang.Throwable -> L20
            r0.f8402c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f5734c     // Catch: java.lang.Throwable -> L20
            X4.i r4 = (X4.i) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f8401b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f5733b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f5734c     // Catch: java.lang.Throwable -> L20
            X4.i r0 = (X4.i) r0     // Catch: java.lang.Throwable -> L20
            r0.f8402c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f5733b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f5733b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L83
        L5a:
            r0 = move-exception
            goto L7e
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = X4.i.f8399f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "5228"
            java.lang.String r7 = com.stub.StubApp.getString2(r7)     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f5733b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7e:
            r10.f5733b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L83:
            if (r1 == 0) goto L8c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.b.b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v43, types: [R3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [R3.i, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.b.run():void");
    }

    public String toString() {
        switch (this.f5732a) {
            case 0:
                g gVar = new g(b.class.getSimpleName(), 17);
                E0 e02 = new E0(13, false);
                ((E0) gVar.f5713d).f16038c = e02;
                gVar.f5713d = e02;
                e02.f16037b = (E0) this.f5734c;
                return gVar.toString();
            case 17:
                Runnable runnable = (Runnable) this.f5733b;
                String string2 = StubApp.getString2(265);
                if (runnable != null) {
                    return StubApp.getString2(5271) + runnable + string2;
                }
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(5272));
                int i3 = ((i) this.f5734c).f8402c;
                sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? StubApp.getString2(1116) : StubApp.getString2(5273) : StubApp.getString2(5274) : StubApp.getString2(5275) : StubApp.getString2(5276));
                sb2.append(string2);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i3, boolean z2) {
        this.f5732a = i3;
        this.f5734c = obj;
        this.f5733b = obj2;
    }

    public b(d dVar, C1200n0 c1200n0) {
        this.f5732a = 23;
        this.f5733b = dVar;
        Objects.requireNonNull(c1200n0);
        this.f5734c = c1200n0;
    }

    public b(AppMeasurementDynamiteService appMeasurementDynamiteService, V6.b bVar) {
        this.f5732a = 28;
        this.f5733b = bVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f5734c = appMeasurementDynamiteService;
    }

    public b(AbstractC1202o abstractC1202o, InterfaceC1216v0 interfaceC1216v0) {
        this.f5732a = 21;
        this.f5733b = interfaceC1216v0;
        Objects.requireNonNull(abstractC1202o);
        this.f5734c = abstractC1202o;
    }

    public b(ServiceConnectionC1167c0 serviceConnectionC1167c0, B b2, ServiceConnectionC1167c0 serviceConnectionC1167c02) {
        this.f5732a = 22;
        this.f5733b = b2;
        this.f5734c = serviceConnectionC1167c0;
    }

    public b(BinderC1212t0 binderC1212t0, C1172e c1172e) {
        this.f5732a = 24;
        this.f5733b = c1172e;
        Objects.requireNonNull(binderC1212t0);
        this.f5734c = binderC1212t0;
    }

    public b(P0 p02, L l9) {
        this.f5732a = 25;
        this.f5733b = l9;
        Objects.requireNonNull(p02);
        this.f5734c = p02;
    }

    public b(P0 p02, Boolean bool) {
        this.f5732a = 26;
        this.f5733b = bool;
        Objects.requireNonNull(p02);
        this.f5734c = p02;
    }

    public b(P0 p02, C1204p c1204p) {
        this.f5732a = 27;
        this.f5733b = c1204p;
        Objects.requireNonNull(p02);
        this.f5734c = p02;
    }

    public b(i iVar) {
        this.f5732a = 17;
        this.f5734c = iVar;
    }
}
