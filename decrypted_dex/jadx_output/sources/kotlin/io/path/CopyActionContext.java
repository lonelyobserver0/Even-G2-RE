package kotlin.io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.8")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lkotlin/io/path/CopyActionContext;", "", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", "target", "followLinks", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalPathApi
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface CopyActionContext {
    CopyActionResult copyToIgnoringExistingDirectory(Path path, Path path2, boolean z2);
}
