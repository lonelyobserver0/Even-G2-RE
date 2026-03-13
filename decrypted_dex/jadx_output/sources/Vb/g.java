package Vb;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7942a;

    static {
        try {
            f7942a = SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new Rb.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
