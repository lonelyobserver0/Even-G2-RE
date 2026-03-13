package com.fasterxml.jackson.core;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface SerializableString {
    int appendQuoted(char[] cArr, int i3);

    int appendQuotedUTF8(byte[] bArr, int i3);

    int appendUnquoted(char[] cArr, int i3);

    int appendUnquotedUTF8(byte[] bArr, int i3);

    char[] asQuotedChars();

    byte[] asQuotedUTF8();

    byte[] asUnquotedUTF8();

    String getValue();
}
