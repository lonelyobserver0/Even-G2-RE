package kotlin.io;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15596b;

    public /* synthetic */ a(int i3, ArrayList arrayList) {
        this.f15595a = i3;
        this.f15596b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit readLines$lambda$0$FilesKt__FileReadWriteKt;
        Unit readLines$lambda$0;
        switch (this.f15595a) {
            case 0:
                readLines$lambda$0$FilesKt__FileReadWriteKt = FilesKt__FileReadWriteKt.readLines$lambda$0$FilesKt__FileReadWriteKt(this.f15596b, (String) obj);
                return readLines$lambda$0$FilesKt__FileReadWriteKt;
            default:
                readLines$lambda$0 = TextStreamsKt.readLines$lambda$0(this.f15596b, (String) obj);
                return readLines$lambda$0;
        }
    }
}
