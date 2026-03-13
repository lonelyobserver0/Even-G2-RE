package Lc;

import Kc.B;
import com.stub.StubApp;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f4417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f4419c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f4420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f4421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f4422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Ref.BooleanRef booleanRef, long j, Ref.LongRef longRef, B b2, Ref.LongRef longRef2, Ref.LongRef longRef3) {
        super(2);
        this.f4417a = booleanRef;
        this.f4418b = j;
        this.f4419c = longRef;
        this.f4420d = b2;
        this.f4421e = longRef2;
        this.f4422f = longRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            Ref.BooleanRef booleanRef = this.f4417a;
            if (booleanRef.element) {
                throw new IOException(StubApp.getString2(25397));
            }
            booleanRef.element = true;
            if (longValue < this.f4418b) {
                throw new IOException(StubApp.getString2(25396));
            }
            Ref.LongRef longRef = this.f4419c;
            long j = longRef.element;
            B b2 = this.f4420d;
            if (j == BodyPartID.bodyIdMax) {
                j = b2.p();
            }
            longRef.element = j;
            Ref.LongRef longRef2 = this.f4421e;
            longRef2.element = longRef2.element == BodyPartID.bodyIdMax ? b2.p() : 0L;
            Ref.LongRef longRef3 = this.f4422f;
            longRef3.element = longRef3.element == BodyPartID.bodyIdMax ? b2.p() : 0L;
        }
        return Unit.INSTANCE;
    }
}
