package N2;

import Qb.I;
import android.service.notification.StatusBarNotification;
import com.even.even_core.services.nls.EvNLService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f4850a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f4851b;

    /* renamed from: c, reason: collision with root package name */
    public String f4852c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f4853d;

    /* renamed from: e, reason: collision with root package name */
    public String f4854e;

    /* renamed from: f, reason: collision with root package name */
    public String f4855f;

    /* renamed from: g, reason: collision with root package name */
    public long f4856g;

    /* renamed from: h, reason: collision with root package name */
    public int f4857h;
    public final /* synthetic */ StatusBarNotification j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ EvNLService f4858k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StatusBarNotification statusBarNotification, EvNLService evNLService, Continuation continuation) {
        super(2, continuation);
        this.j = statusBarNotification;
        this.f4858k = evNLService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.j, this.f4858k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x016a, code lost:
    
        if (r14 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0724, code lost:
    
        if (r1 == null) goto L251;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0166 A[Catch: all -> 0x0147, Exception -> 0x014c, TryCatch #18 {Exception -> 0x014c, all -> 0x0147, blocks: (B:92:0x012f, B:94:0x013d, B:98:0x0153, B:100:0x0166, B:102:0x016d, B:104:0x0199, B:106:0x01c5, B:108:0x01d5, B:110:0x01e8, B:112:0x01fb, B:114:0x020e, B:116:0x0221, B:118:0x0231, B:120:0x0246, B:122:0x0254, B:124:0x0261, B:125:0x0268, B:127:0x0270, B:129:0x0278, B:131:0x0280, B:135:0x028c, B:138:0x029c, B:143:0x02b3, B:145:0x02bd, B:147:0x02c7, B:150:0x02de, B:153:0x0335, B:160:0x035d, B:162:0x040c, B:164:0x0420, B:242:0x0443, B:249:0x0498, B:251:0x04a4, B:256:0x04db, B:259:0x04ed, B:332:0x0369, B:334:0x038a, B:336:0x03ac, B:338:0x03b2, B:341:0x03b8, B:343:0x03c5, B:345:0x03cf, B:346:0x03e2, B:348:0x03ec, B:350:0x03fe, B:359:0x01a9, B:361:0x01bf), top: B:91:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5 A[Catch: all -> 0x0147, Exception -> 0x014c, TryCatch #18 {Exception -> 0x014c, all -> 0x0147, blocks: (B:92:0x012f, B:94:0x013d, B:98:0x0153, B:100:0x0166, B:102:0x016d, B:104:0x0199, B:106:0x01c5, B:108:0x01d5, B:110:0x01e8, B:112:0x01fb, B:114:0x020e, B:116:0x0221, B:118:0x0231, B:120:0x0246, B:122:0x0254, B:124:0x0261, B:125:0x0268, B:127:0x0270, B:129:0x0278, B:131:0x0280, B:135:0x028c, B:138:0x029c, B:143:0x02b3, B:145:0x02bd, B:147:0x02c7, B:150:0x02de, B:153:0x0335, B:160:0x035d, B:162:0x040c, B:164:0x0420, B:242:0x0443, B:249:0x0498, B:251:0x04a4, B:256:0x04db, B:259:0x04ed, B:332:0x0369, B:334:0x038a, B:336:0x03ac, B:338:0x03b2, B:341:0x03b8, B:343:0x03c5, B:345:0x03cf, B:346:0x03e2, B:348:0x03ec, B:350:0x03fe, B:359:0x01a9, B:361:0x01bf), top: B:91:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06df A[Catch: all -> 0x0527, Exception -> 0x052e, TryCatch #0 {Exception -> 0x052e, blocks: (B:168:0x06d3, B:170:0x06df, B:172:0x06e7, B:173:0x06ee, B:184:0x0791, B:214:0x06f4, B:216:0x06fe, B:218:0x0704, B:221:0x0714, B:223:0x0720, B:225:0x0727, B:227:0x0731, B:228:0x074b, B:230:0x0758, B:232:0x0764, B:234:0x076a, B:236:0x0774, B:261:0x0562, B:263:0x0568, B:265:0x05a2, B:267:0x05a8, B:268:0x05e1, B:270:0x05eb, B:271:0x05fa, B:287:0x06c6, B:308:0x05c1, B:310:0x05c9, B:311:0x0583, B:313:0x0589, B:320:0x051c, B:322:0x053d, B:324:0x054b), top: B:158:0x035a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x08f0 A[Catch: all -> 0x0894, Exception -> 0x0897, TRY_LEAVE, TryCatch #6 {Exception -> 0x0897, blocks: (B:13:0x08dc, B:17:0x08f0, B:21:0x08f6, B:23:0x0902, B:24:0x0942, B:43:0x0876, B:47:0x08a0, B:49:0x08a4, B:51:0x08aa, B:356:0x09f9, B:374:0x0a12), top: B:2:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0805 A[Catch: all -> 0x07ce, Exception -> 0x07d1, TryCatch #16 {Exception -> 0x07d1, all -> 0x07ce, blocks: (B:33:0x0852, B:72:0x07c0, B:188:0x07b3, B:201:0x0805, B:203:0x0813, B:205:0x081b), top: B:2:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06f4 A[Catch: all -> 0x0527, Exception -> 0x052e, TryCatch #0 {Exception -> 0x052e, blocks: (B:168:0x06d3, B:170:0x06df, B:172:0x06e7, B:173:0x06ee, B:184:0x0791, B:214:0x06f4, B:216:0x06fe, B:218:0x0704, B:221:0x0714, B:223:0x0720, B:225:0x0727, B:227:0x0731, B:228:0x074b, B:230:0x0758, B:232:0x0764, B:234:0x076a, B:236:0x0774, B:261:0x0562, B:263:0x0568, B:265:0x05a2, B:267:0x05a8, B:268:0x05e1, B:270:0x05eb, B:271:0x05fa, B:287:0x06c6, B:308:0x05c1, B:310:0x05c9, B:311:0x0583, B:313:0x0589, B:320:0x051c, B:322:0x053d, B:324:0x054b), top: B:158:0x035a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x08f6 A[Catch: all -> 0x0894, Exception -> 0x0897, TRY_ENTER, TryCatch #6 {Exception -> 0x0897, blocks: (B:13:0x08dc, B:17:0x08f0, B:21:0x08f6, B:23:0x0902, B:24:0x0942, B:43:0x0876, B:47:0x08a0, B:49:0x08a4, B:51:0x08aa, B:356:0x09f9, B:374:0x0a12), top: B:2:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01bf A[Catch: all -> 0x0147, Exception -> 0x014c, TRY_LEAVE, TryCatch #18 {Exception -> 0x014c, all -> 0x0147, blocks: (B:92:0x012f, B:94:0x013d, B:98:0x0153, B:100:0x0166, B:102:0x016d, B:104:0x0199, B:106:0x01c5, B:108:0x01d5, B:110:0x01e8, B:112:0x01fb, B:114:0x020e, B:116:0x0221, B:118:0x0231, B:120:0x0246, B:122:0x0254, B:124:0x0261, B:125:0x0268, B:127:0x0270, B:129:0x0278, B:131:0x0280, B:135:0x028c, B:138:0x029c, B:143:0x02b3, B:145:0x02bd, B:147:0x02c7, B:150:0x02de, B:153:0x0335, B:160:0x035d, B:162:0x040c, B:164:0x0420, B:242:0x0443, B:249:0x0498, B:251:0x04a4, B:256:0x04db, B:259:0x04ed, B:332:0x0369, B:334:0x038a, B:336:0x03ac, B:338:0x03b2, B:341:0x03b8, B:343:0x03c5, B:345:0x03cf, B:346:0x03e2, B:348:0x03ec, B:350:0x03fe, B:359:0x01a9, B:361:0x01bf), top: B:91:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07cc  */
    /* JADX WARN: Type inference failed for: r0v106, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v51, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [T] */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v104, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v200 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.even.even_core.services.nls.EvNLService] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v58, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v80, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v61, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [T] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.StringBuilder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 2637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
