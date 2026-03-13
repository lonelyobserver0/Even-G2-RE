package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.stub.StubApp;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements ContextualSerializer {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    public boolean _asTimestamp(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (serializerProvider != null) {
            return serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException(StubApp.getString2(11017).concat(handledType().getName()));
    }

    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._customFormat == null) {
            serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.writeString(andSet.format(date));
        AtomicReference<DateFormat> atomicReference = this._reusedCustomFormat;
        while (!atomicReference.compareAndSet(null, andSet) && atomicReference.get() == null) {
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides != null) {
            JsonFormat.Shape shape = findFormatOverrides.getShape();
            if (shape.isNumeric()) {
                return withFormat2(Boolean.TRUE, null);
            }
            if (findFormatOverrides.hasPattern()) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(findFormatOverrides.getPattern(), findFormatOverrides.hasLocale() ? findFormatOverrides.getLocale() : serializerProvider.getLocale());
                simpleDateFormat.setTimeZone(findFormatOverrides.hasTimeZone() ? findFormatOverrides.getTimeZone() : serializerProvider.getTimeZone());
                return withFormat2(Boolean.FALSE, simpleDateFormat);
            }
            boolean hasLocale = findFormatOverrides.hasLocale();
            boolean hasTimeZone = findFormatOverrides.hasTimeZone();
            boolean z2 = shape == JsonFormat.Shape.STRING;
            if (hasLocale || hasTimeZone || z2) {
                DateFormat dateFormat = serializerProvider.getConfig().getDateFormat();
                if (dateFormat instanceof StdDateFormat) {
                    StdDateFormat stdDateFormat = (StdDateFormat) dateFormat;
                    if (findFormatOverrides.hasLocale()) {
                        stdDateFormat = stdDateFormat.withLocale(findFormatOverrides.getLocale());
                    }
                    if (findFormatOverrides.hasTimeZone()) {
                        stdDateFormat = stdDateFormat.withTimeZone(findFormatOverrides.getTimeZone());
                    }
                    return withFormat2(Boolean.FALSE, stdDateFormat);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    serializerProvider.reportBadDefinition((Class<?>) handledType(), StubApp.getString2(11018) + dateFormat.getClass().getName() + StubApp.getString2(11019));
                }
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
                SimpleDateFormat simpleDateFormat3 = hasLocale ? new SimpleDateFormat(simpleDateFormat2.toPattern(), findFormatOverrides.getLocale()) : (SimpleDateFormat) simpleDateFormat2.clone();
                TimeZone timeZone = findFormatOverrides.getTimeZone();
                if (timeZone != null && !timeZone.equals(simpleDateFormat3.getTimeZone())) {
                    simpleDateFormat3.setTimeZone(timeZone);
                }
                return withFormat2(Boolean.FALSE, simpleDateFormat3);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t3) {
        return false;
    }

    /* renamed from: withFormat */
    public abstract DateTimeSerializerBase<T> withFormat2(Boolean bool, DateFormat dateFormat);
}
