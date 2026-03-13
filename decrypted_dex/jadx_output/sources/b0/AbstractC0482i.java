package b0;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: b0.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0482i {
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j, int i3) throws ErrnoException {
        return Os.lseek(fileDescriptor, j, i3);
    }
}
