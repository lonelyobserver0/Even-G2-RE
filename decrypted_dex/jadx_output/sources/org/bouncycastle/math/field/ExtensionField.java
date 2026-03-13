package org.bouncycastle.math.field;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ExtensionField extends FiniteField {
    int getDegree();

    FiniteField getSubfield();
}
