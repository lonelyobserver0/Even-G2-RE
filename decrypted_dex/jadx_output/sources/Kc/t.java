package Kc;

import com.stub.StubApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class t extends o {
    @Override // Kc.o
    public n b(y path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File e10 = path.e();
        boolean isFile = e10.isFile();
        boolean isDirectory = e10.isDirectory();
        long lastModified = e10.lastModified();
        long length = e10.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || e10.exists()) {
            return new n(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    public void c(y source, y target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.e().renameTo(target.e())) {
            return;
        }
        throw new IOException(StubApp.getString2(25383) + source + StubApp.getString2(1632) + target);
    }

    public final void d(y path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException(StubApp.getString2(25339));
        }
        File e10 = path.e();
        if (e10.delete() || !e10.exists()) {
            return;
        }
        throw new IOException(StubApp.getString2(25384) + path);
    }

    public final s e(y file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new s(false, new RandomAccessFile(file.e(), StubApp.getString2(1269)));
    }

    public final H f(y file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File e10 = file.e();
        Logger logger = v.f3853a;
        Intrinsics.checkNotNullParameter(e10, "<this>");
        return new C0098e(new FileInputStream(e10), J.f3789d);
    }

    public String toString() {
        return StubApp.getString2(25385);
    }
}
