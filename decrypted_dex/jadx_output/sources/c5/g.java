package c5;

import com.stub.StubApp;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class g implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10875a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String filename) {
        switch (this.f10875a) {
            case 0:
                return filename.startsWith(StubApp.getString2(9468));
            case 1:
                return filename.startsWith(StubApp.getString2(9467));
            case 2:
                return filename.startsWith(StubApp.getString2(1420));
            case 3:
                return filename.startsWith(StubApp.getString2(1420)) && !filename.endsWith(StubApp.getString2(4956));
            case 4:
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                return StringsKt.u(filename, StubApp.getString2(9466));
            default:
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                return StringsKt.u(filename, StubApp.getString2(9465));
        }
    }
}
