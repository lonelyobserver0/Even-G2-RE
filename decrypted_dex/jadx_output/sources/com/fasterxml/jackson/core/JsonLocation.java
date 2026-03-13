package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.ContentReference;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonLocation implements Serializable {
    public static final JsonLocation NA = new JsonLocation(ContentReference.unknown(), -1, -1, -1, -1);
    protected final int _columnNr;
    protected final ContentReference _contentReference;
    protected final int _lineNr;
    protected transient String _sourceDescription;
    protected final long _totalBytes;
    protected final long _totalChars;

    public JsonLocation(ContentReference contentReference, long j, int i3, int i10) {
        this(contentReference, -1L, j, i3, i10);
    }

    public StringBuilder appendOffsetDescription(StringBuilder sb2) {
        if (this._contentReference.hasTextualContent()) {
            sb2.append("line: ");
            int i3 = this._lineNr;
            if (i3 >= 0) {
                sb2.append(i3);
            } else {
                sb2.append("UNKNOWN");
            }
            sb2.append(", column: ");
            int i10 = this._columnNr;
            if (i10 >= 0) {
                sb2.append(i10);
                return sb2;
            }
            sb2.append("UNKNOWN");
            return sb2;
        }
        if (this._lineNr > 0) {
            sb2.append("line: ");
            sb2.append(this._lineNr);
            if (this._columnNr > 0) {
                sb2.append(", column: ");
                sb2.append(this._columnNr);
            }
            return sb2;
        }
        sb2.append("byte offset: #");
        long j = this._totalBytes;
        if (j >= 0) {
            sb2.append(j);
            return sb2;
        }
        sb2.append("UNKNOWN");
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        ContentReference contentReference = this._contentReference;
        if (contentReference == null) {
            if (jsonLocation._contentReference != null) {
                return false;
            }
        } else if (!contentReference.equals(jsonLocation._contentReference)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && this._totalBytes == jsonLocation._totalBytes;
    }

    public int hashCode() {
        return ((((this._contentReference == null ? 1 : 2) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String sourceDescription() {
        if (this._sourceDescription == null) {
            this._sourceDescription = this._contentReference.buildSourceDescription();
        }
        return this._sourceDescription;
    }

    public String toString() {
        String sourceDescription = sourceDescription();
        StringBuilder sb2 = new StringBuilder(sourceDescription.length() + 40);
        sb2.append("[Source: ");
        sb2.append(sourceDescription);
        sb2.append("; ");
        StringBuilder appendOffsetDescription = appendOffsetDescription(sb2);
        appendOffsetDescription.append(']');
        return appendOffsetDescription.toString();
    }

    public JsonLocation(ContentReference contentReference, long j, long j3, int i3, int i10) {
        this._contentReference = contentReference == null ? ContentReference.unknown() : contentReference;
        this._totalBytes = j;
        this._totalChars = j3;
        this._lineNr = i3;
        this._columnNr = i10;
    }
}
