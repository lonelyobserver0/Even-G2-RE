package A8;

import Z9.C;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C f220a = new C(1, (byte) 0);

    public static ArrayList a(String command) {
        Intrinsics.checkNotNullParameter(command, "command");
        C c10 = f220a;
        c10.getClass();
        Intrinsics.checkNotNullParameter(command, "command");
        LinkedHashSet linkedHashSet = (LinkedHashSet) c10.f9077b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            ((b) obj).getClass();
            if (Intrinsics.areEqual("help", command)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
