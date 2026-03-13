package Kc;

import com.stub.StubApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class u extends t {
    public static Long g(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // Kc.t, Kc.o
    public final n b(y path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path nioPath = path.f();
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = y.f3858b;
                Intrinsics.checkNotNullParameter(readSymbolicLink, "<this>");
                C2.i.v(readSymbolicLink.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long g10 = creationTime != null ? g(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long g11 = lastModifiedTime != null ? g(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new n(isRegularFile, isDirectory, valueOf, g10, g11, lastAccessTime != null ? g(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // Kc.t
    public final void c(y source, y target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.f(), target.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException(StubApp.getString2(25386));
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // Kc.t
    public final String toString() {
        return StubApp.getString2(25387);
    }
}
