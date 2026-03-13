package g3;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata;
import java.util.function.Predicate;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0954a implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$findStringBasedKeyDeserializer$0;
        lambda$findStringBasedKeyDeserializer$0 = StdKeyDeserializers.lambda$findStringBasedKeyDeserializer$0((AnnotatedAndMetadata) obj);
        return lambda$findStringBasedKeyDeserializer$0;
    }
}
