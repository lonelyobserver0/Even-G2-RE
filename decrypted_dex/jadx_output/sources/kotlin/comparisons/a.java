package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15586b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f15585a = i3;
        this.f15586b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int nullsLast$lambda$0$ComparisonsKt__ComparisonsKt;
        int nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt;
        int compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        switch (this.f15585a) {
            case 0:
                nullsLast$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsLast$lambda$0$ComparisonsKt__ComparisonsKt((Comparator) this.f15586b, obj, obj2);
                return nullsLast$lambda$0$ComparisonsKt__ComparisonsKt;
            case 1:
                nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt((Comparator) this.f15586b, obj, obj2);
                return nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt;
            default:
                compareBy$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((Function1[]) this.f15586b, obj, obj2);
                return compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        }
    }
}
