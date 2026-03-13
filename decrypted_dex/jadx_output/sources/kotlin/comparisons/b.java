package kotlin.comparisons;

import java.util.Comparator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f15588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparator f15589c;

    public /* synthetic */ b(Comparator comparator, Comparator comparator2, int i3) {
        this.f15587a = i3;
        this.f15588b = comparator;
        this.f15589c = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int thenDescending$lambda$0$ComparisonsKt__ComparisonsKt;
        int then$lambda$0$ComparisonsKt__ComparisonsKt;
        switch (this.f15587a) {
            case 0:
                thenDescending$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.thenDescending$lambda$0$ComparisonsKt__ComparisonsKt(this.f15588b, this.f15589c, obj, obj2);
                return thenDescending$lambda$0$ComparisonsKt__ComparisonsKt;
            default:
                then$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.then$lambda$0$ComparisonsKt__ComparisonsKt(this.f15588b, this.f15589c, obj, obj2);
                return then$lambda$0$ComparisonsKt__ComparisonsKt;
        }
    }
}
