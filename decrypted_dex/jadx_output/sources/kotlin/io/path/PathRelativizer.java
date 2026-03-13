package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "<init>", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class PathRelativizer {
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path emptyPath = Paths.get("", new String[0]);
    private static final Path parentPath = Paths.get("..", new String[0]);

    private PathRelativizer() {
    }

    public final Path tryRelativeTo(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        Path normalize = base.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        for (int i3 = 0; i3 < min; i3++) {
            Path name = normalize.getName(i3);
            Path path2 = parentPath;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            if (!Intrinsics.areEqual(normalize2.getName(i3), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(normalize2, normalize) || !Intrinsics.areEqual(normalize, emptyPath)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            normalize2 = StringsKt.u(obj, separator) ? relativize.getFileSystem().getPath(StringsKt.dropLast(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        Intrinsics.checkNotNull(normalize2);
        return normalize2;
    }
}
