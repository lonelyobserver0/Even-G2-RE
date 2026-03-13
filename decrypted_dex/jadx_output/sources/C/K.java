package C;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f811a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f812b;

    /* renamed from: c, reason: collision with root package name */
    public String f813c;

    /* renamed from: d, reason: collision with root package name */
    public String f814d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f816f;

    public static K a(Person person) {
        CharSequence name = person.getName();
        IconCompat c10 = person.getIcon() != null ? IconCompat.c(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        K k3 = new K();
        k3.f811a = name;
        k3.f812b = c10;
        k3.f813c = uri;
        k3.f814d = key;
        k3.f815e = isBot;
        k3.f816f = isImportant;
        return k3;
    }

    public static K b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(StubApp.getString2(727));
        CharSequence charSequence = bundle.getCharSequence(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        IconCompat b2 = bundle2 != null ? IconCompat.b(bundle2) : null;
        String string = bundle.getString(StubApp.getString2(614));
        String string2 = bundle.getString(StubApp.getString2(728));
        boolean z2 = bundle.getBoolean(StubApp.getString2(729));
        boolean z10 = bundle.getBoolean(StubApp.getString2(730));
        K k3 = new K();
        k3.f811a = charSequence;
        k3.f812b = b2;
        k3.f813c = string;
        k3.f814d = string2;
        k3.f815e = z2;
        k3.f816f = z10;
        return k3;
    }

    public final Person c() {
        Person.Builder name = new Person.Builder().setName(this.f811a);
        IconCompat iconCompat = this.f812b;
        return name.setIcon(iconCompat != null ? iconCompat.h(null) : null).setUri(this.f813c).setKey(this.f814d).setBot(this.f815e).setImportant(this.f816f).build();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        String str = this.f814d;
        String str2 = k3.f814d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f811a), Objects.toString(k3.f811a)) && Objects.equals(this.f813c, k3.f813c) && Boolean.valueOf(this.f815e).equals(Boolean.valueOf(k3.f815e)) && Boolean.valueOf(this.f816f).equals(Boolean.valueOf(k3.f816f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f814d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f811a, this.f813c, Boolean.valueOf(this.f815e), Boolean.valueOf(this.f816f));
    }
}
