package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DefaultPrettyPrinter implements PrettyPrinter, Instantiatable<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    protected Indenter _arrayIndenter;
    protected transient int _nesting;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected Indenter _objectIndenter;
    protected final SerializableString _rootSeparator;
    protected Separators _separators;
    protected boolean _spacesInObjectEntries;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public void writeIndentation(JsonGenerator jsonGenerator, int i3) throws IOException {
            jsonGenerator.writeRaw(' ');
        }
    }

    public interface Indenter {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i3) throws IOException;
    }

    public static class NopIndenter implements Indenter, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public void writeIndentation(JsonGenerator jsonGenerator, int i3) throws IOException {
        }
    }

    public DefaultPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        this._separators = separators;
        this._objectFieldValueSeparatorWithSpaces = " " + separators.getObjectFieldValueSeparator() + " ";
        return this;
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._separators.getArrayValueSeparator());
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndArray(JsonGenerator jsonGenerator, int i3) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i3 > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(' ');
        }
        jsonGenerator.writeRaw(']');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndObject(JsonGenerator jsonGenerator, int i3) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i3 > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(' ');
        }
        jsonGenerator.writeRaw('}');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._separators.getObjectEntrySeparator());
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.writeRaw(this._objectFieldValueSeparatorWithSpaces);
        } else {
            jsonGenerator.writeRaw(this._separators.getObjectFieldValueSeparator());
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        SerializableString serializableString = this._rootSeparator;
        if (serializableString != null) {
            jsonGenerator.writeRaw(serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.writeRaw('[');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('{');
        if (this._objectIndenter.isInline()) {
            return;
        }
        this._nesting++;
    }

    public DefaultPrettyPrinter(SerializableString serializableString) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = serializableString;
        withSeparators(PrettyPrinter.DEFAULT_SEPARATORS);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.core.util.Instantiatable
    public DefaultPrettyPrinter createInstance() {
        if (getClass() == DefaultPrettyPrinter.class) {
            return new DefaultPrettyPrinter(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, SerializableString serializableString) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._rootSeparator = serializableString;
    }
}
