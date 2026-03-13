package com.fasterxml.jackson.databind.util;

import com.stub.StubApp;
import java.io.Serializable;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z2 = false;
        boolean z10 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z2 = true;
        }
        return z10 ? z2 ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.1
            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(11101));
                sb2.append(str);
                sb2.append(StubApp.getString2(11102));
                return AbstractC1482f.k(sb2, str2, StubApp.getString2(11103));
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return str + str3 + str2;
            }
        } : new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
            public String toString() {
                return AbstractC1482f.k(new StringBuilder(StubApp.getString2(11104)), str, StubApp.getString2(11103));
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return AbstractC1482f.k(new StringBuilder(), str, str3);
            }
        } : z2 ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.3
            public String toString() {
                return AbstractC1482f.k(new StringBuilder(StubApp.getString2(11105)), str2, StubApp.getString2(11103));
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                StringBuilder b2 = AbstractC1856e.b(str3);
                b2.append(str2);
                return b2.toString();
            }
        } : NOP;
    }

    public abstract String transform(String str);
}
