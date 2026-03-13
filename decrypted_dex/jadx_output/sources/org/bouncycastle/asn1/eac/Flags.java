package org.bouncycastle.asn1.eac;

import com.stub.StubApp;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Flags {
    int value;

    public static class StringJoiner {
        boolean First = true;

        /* renamed from: b, reason: collision with root package name */
        StringBuffer f18678b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f18678b.append(this.mSeparator);
            }
            this.f18678b.append(str);
        }

        public String toString() {
            return this.f18678b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    public String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(StubApp.getString2(397));
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i3) {
        return (i3 & this.value) != 0;
    }

    public void set(int i3) {
        this.value = i3 | this.value;
    }

    public Flags(int i3) {
        this.value = i3;
    }
}
