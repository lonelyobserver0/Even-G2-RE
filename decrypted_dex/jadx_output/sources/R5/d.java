package R5;

import com.stub.StubApp;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6215a = Pattern.compile(StubApp.getString2(321));

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f6216b;

    static {
        EnumSet of = EnumSet.of(N5.a.f4873m);
        EnumSet of2 = EnumSet.of(N5.a.f4868f);
        EnumSet of3 = EnumSet.of(N5.a.f4863a);
        EnumSet of4 = EnumSet.of(N5.a.f4872l);
        EnumSet of5 = EnumSet.of(N5.a.f4876q, N5.a.f4877r, N5.a.f4870h, N5.a.f4869g, N5.a.f4874n, N5.a.f4875p);
        EnumSet of6 = EnumSet.of(N5.a.f4865c, N5.a.f4866d, N5.a.f4867e, N5.a.j, N5.a.f4864b);
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f6216b = hashMap;
        hashMap.put(StubApp.getString2(5715), copyOf);
        hashMap.put(StubApp.getString2(5716), of5);
        hashMap.put(StubApp.getString2(5717), of);
        hashMap.put(StubApp.getString2(5718), of2);
        hashMap.put(StubApp.getString2(5719), of3);
        hashMap.put(StubApp.getString2(5720), of4);
    }
}
