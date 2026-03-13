package A8;

import com.stub.StubApp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {
    public static String c(Pair pair) {
        return ((String) pair.getFirst()) + StubApp.getString2(81) + ((String) pair.getSecond());
    }

    public final ArrayList a() {
        List list = CollectionsKt.toList((LinkedHashSet) c.f220a.f9077b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual((b) obj, this)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).getClass();
            arrayList2.add(new Pair(StubApp.getString2(355), StubApp.getString2(356)));
        }
        return arrayList2;
    }

    public final void b(FileDescriptor fileDescriptor, PrintWriter writer, List commands) {
        String substringAfter$default;
        String joinToString$default;
        String joinToString$default2;
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(commands, "commands");
        boolean isEmpty = commands.isEmpty();
        String string2 = StubApp.getString2(357);
        if (isEmpty) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(358));
            ArrayList a3 = a();
            String lineSeparator = System.lineSeparator();
            Intrinsics.checkNotNullExpressionValue(lineSeparator, string2);
            joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(a3, lineSeparator, null, null, 0, null, new a(this, 0), 30, null);
            sb2.append(joinToString$default2);
            sb2.append(StubApp.getString2(359));
            writer.println(StringsKt.trimIndent(sb2.toString()));
            return;
        }
        if (commands.size() == 1 && Intrinsics.areEqual(commands.get(0), "help")) {
            writer.println(StubApp.getString2(360));
            ArrayList a9 = a();
            String lineSeparator2 = System.lineSeparator();
            Intrinsics.checkNotNullExpressionValue(lineSeparator2, string2);
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(a9, lineSeparator2, null, null, 0, null, new a(this, 0), 30, null);
            writer.println(joinToString$default);
            return;
        }
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            substringAfter$default = StringsKt__StringsKt.substringAfter$default(str, StubApp.getString2(361), (String) null, 2, (Object) null);
            ArrayList a10 = c.a(substringAfter$default);
            if (a10.isEmpty()) {
                writer.println(StubApp.getString2(362) + str);
            } else {
                writer.println(StubApp.getString2(363) + str);
                Iterator it2 = a10.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((b) it2.next()).a().iterator();
                    while (it3.hasNext()) {
                        writer.println(StubApp.getString2(364) + c((Pair) it3.next()));
                    }
                }
            }
        }
    }
}
