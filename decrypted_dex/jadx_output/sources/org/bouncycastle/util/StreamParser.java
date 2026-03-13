package org.bouncycastle.util;

import java.util.Collection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface StreamParser {
    Object read() throws StreamParsingException;

    Collection readAll() throws StreamParsingException;
}
