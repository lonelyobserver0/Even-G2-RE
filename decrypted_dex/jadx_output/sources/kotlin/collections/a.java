package kotlin.collections;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KMappedMarker f15579b;

    public /* synthetic */ a(KMappedMarker kMappedMarker, int i3) {
        this.f15578a = i3;
        this.f15579b = kMappedMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence string$lambda$0;
        CharSequence string$lambda$02;
        switch (this.f15578a) {
            case 0:
                string$lambda$0 = AbstractCollection.toString$lambda$0((AbstractCollection) this.f15579b, obj);
                return string$lambda$0;
            default:
                string$lambda$02 = AbstractMap.toString$lambda$0((AbstractMap) this.f15579b, (Map.Entry) obj);
                return string$lambda$02;
        }
    }
}
