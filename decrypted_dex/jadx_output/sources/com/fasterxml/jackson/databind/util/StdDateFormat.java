package com.fasterxml.jackson.databind.util;

import E1.a;
import com.fasterxml.jackson.core.io.NumberInput;
import com.stub.StubApp;
import i2.u;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class StdDateFormat extends DateFormat {
    protected static final String[] ALL_FORMATS;
    protected static final Calendar CALENDAR;
    protected static final DateFormat DATE_FORMAT_RFC1123;
    protected static final Locale DEFAULT_LOCALE;
    protected static final TimeZone DEFAULT_TIMEZONE;
    protected static final Pattern PATTERN_ISO8601;
    protected static final Pattern PATTERN_PLAIN = Pattern.compile(StubApp.getString2(11112));
    public static final StdDateFormat instance;
    private transient Calendar _calendar;
    private transient DateFormat _formatRFC1123;
    protected Boolean _lenient;
    protected final Locale _locale;
    protected transient TimeZone _timezone;
    private boolean _tzSerializedWithColon;

    static {
        try {
            PATTERN_ISO8601 = Pattern.compile(StubApp.getString2("11113"));
            String string2 = StubApp.getString2(11114);
            String string22 = StubApp.getString2(11115);
            String string23 = StubApp.getString2(11116);
            String string24 = StubApp.getString2(11117);
            ALL_FORMATS = new String[]{string23, string2, string24, string22};
            TimeZone timeZone = TimeZone.getTimeZone(StubApp.getString2(8779));
            DEFAULT_TIMEZONE = timeZone;
            Locale locale = Locale.US;
            DEFAULT_LOCALE = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string24, locale);
            DATE_FORMAT_RFC1123 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            instance = new StdDateFormat();
            CALENDAR = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public StdDateFormat() {
        this._tzSerializedWithColon = true;
        this._locale = DEFAULT_LOCALE;
    }

    private static final DateFormat _cloneFormat(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat dateFormat2;
        if (locale.equals(DEFAULT_LOCALE)) {
            dateFormat2 = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                dateFormat2.setTimeZone(timeZone);
            }
        } else {
            dateFormat2 = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = DEFAULT_TIMEZONE;
            }
            dateFormat2.setTimeZone(timeZone);
        }
        if (bool != null) {
            dateFormat2.setLenient(bool.booleanValue());
        }
        return dateFormat2;
    }

    public static <T> boolean _equals(T t3, T t10) {
        if (t3 == t10) {
            return true;
        }
        return t3 != null && t3.equals(t10);
    }

    private static int _parse2D(String str, int i3) {
        return (str.charAt(i3 + 1) - '0') + ((str.charAt(i3) - '0') * 10);
    }

    private static int _parse4D(String str, int i3) {
        return (str.charAt(i3 + 3) - '0') + ((str.charAt(i3 + 2) - '0') * 10) + ((str.charAt(i3 + 1) - '0') * 100) + ((str.charAt(i3) - '0') * 1000);
    }

    private Date _parseDateFromLong(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(NumberInput.parseLong(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(a.k(StubApp.getString2(11118), str, StubApp.getString2(11119)), parsePosition.getErrorIndex());
        }
    }

    private static void pad2(StringBuffer stringBuffer, int i3) {
        int i10 = i3 / 10;
        if (i10 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i10 + 48));
            i3 -= i10 * 10;
        }
        stringBuffer.append((char) (i3 + 48));
    }

    private static void pad3(StringBuffer stringBuffer, int i3) {
        int i10 = i3 / 100;
        if (i10 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i10 + 48));
            i3 -= i10 * 100;
        }
        pad2(stringBuffer, i3);
    }

    private static void pad4(StringBuffer stringBuffer, int i3) {
        int i10 = i3 / 100;
        if (i10 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i10 > 99) {
                stringBuffer.append(i10);
            } else {
                pad2(stringBuffer, i10);
            }
            i3 -= i10 * 100;
        }
        pad2(stringBuffer, i3);
    }

    public void _clearFormats() {
        this._formatRFC1123 = null;
    }

    public void _format(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar _getCalendar = _getCalendar(timeZone);
        _getCalendar.setTime(date);
        int i3 = _getCalendar.get(1);
        if (_getCalendar.get(0) == 0) {
            _formatBCEYear(stringBuffer, i3);
        } else {
            if (i3 > 9999) {
                stringBuffer.append('+');
            }
            pad4(stringBuffer, i3);
        }
        stringBuffer.append('-');
        pad2(stringBuffer, _getCalendar.get(2) + 1);
        stringBuffer.append('-');
        pad2(stringBuffer, _getCalendar.get(5));
        stringBuffer.append('T');
        pad2(stringBuffer, _getCalendar.get(11));
        stringBuffer.append(':');
        pad2(stringBuffer, _getCalendar.get(12));
        stringBuffer.append(':');
        pad2(stringBuffer, _getCalendar.get(13));
        stringBuffer.append('.');
        pad3(stringBuffer, _getCalendar.get(14));
        int offset = timeZone.getOffset(_getCalendar.getTimeInMillis());
        if (offset == 0) {
            if (this._tzSerializedWithColon) {
                stringBuffer.append(StubApp.getString2(11120));
                return;
            } else {
                stringBuffer.append(StubApp.getString2(11121));
                return;
            }
        }
        int i10 = offset / 60000;
        int abs = Math.abs(i10 / 60);
        int abs2 = Math.abs(i10 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        pad2(stringBuffer, abs);
        if (this._tzSerializedWithColon) {
            stringBuffer.append(':');
        }
        pad2(stringBuffer, abs2);
    }

    public void _formatBCEYear(StringBuffer stringBuffer, int i3) {
        if (i3 == 1) {
            stringBuffer.append(StubApp.getString2(11121));
        } else {
            stringBuffer.append('-');
            pad4(stringBuffer, i3 - 1);
        }
    }

    public Calendar _getCalendar(TimeZone timeZone) {
        Calendar calendar = this._calendar;
        if (calendar == null) {
            calendar = (Calendar) CALENDAR.clone();
            this._calendar = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public Date _parseAsISO8601(String str, ParsePosition parsePosition) throws IllegalArgumentException, ParseException {
        String string2;
        int i3;
        int i10;
        int length = str.length();
        TimeZone timeZone = DEFAULT_TIMEZONE;
        if (this._timezone != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this._timezone;
        }
        Calendar _getCalendar = _getCalendar(timeZone);
        _getCalendar.clear();
        String string22 = StubApp.getString2(11122);
        int i11 = 0;
        if (length > 10) {
            Matcher matcher = PATTERN_ISO8601.matcher(str);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i12 = end - start;
                if (i12 > 1) {
                    int _parse2D = _parse2D(str, start + 1) * 3600;
                    if (i12 >= 5) {
                        _parse2D += _parse2D(str, end - 2) * 60;
                    }
                    _getCalendar.set(15, str.charAt(start) == '-' ? _parse2D * (-1000) : _parse2D * 1000);
                    _getCalendar.set(16, 0);
                }
                int _parse4D = _parse4D(str, 0);
                int _parse2D2 = _parse2D(str, 5) - 1;
                int _parse2D3 = _parse2D(str, 8);
                int _parse2D4 = _parse2D(str, 11);
                int _parse2D5 = _parse2D(str, 14);
                if (length <= 16 || str.charAt(16) != ':') {
                    i3 = _parse2D3;
                    i10 = 0;
                } else {
                    i3 = _parse2D3;
                    i10 = _parse2D(str, 17);
                }
                _getCalendar.set(_parse4D, _parse2D2, i3, _parse2D4, _parse2D5, i10);
                int start2 = matcher.start(1);
                int i13 = start2 + 1;
                int end2 = matcher.end(1);
                if (i13 >= end2) {
                    _getCalendar.set(14, 0);
                } else {
                    int i14 = end2 - i13;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3 && i14 > 9) {
                                    throw new ParseException(AbstractC1482f.j(string22, str, StubApp.getString2(11123), matcher.group(1).substring(1), StubApp.getString2(11124)), i13);
                                }
                                i11 = str.charAt(start2 + 3) - '0';
                            }
                            i11 += (str.charAt(start2 + 2) - '0') * 10;
                        }
                        i11 += (str.charAt(i13) - '0') * 100;
                    }
                    _getCalendar.set(14, i11);
                }
                return _getCalendar.getTime();
            }
            string2 = StubApp.getString2(11116);
        } else {
            if (PATTERN_PLAIN.matcher(str).matches()) {
                _getCalendar.set(_parse4D(str, 0), _parse2D(str, 5) - 1, _parse2D(str, 8), 0, 0, 0);
                _getCalendar.set(14, 0);
                return _getCalendar.getTime();
            }
            string2 = StubApp.getString2(11115);
        }
        Boolean bool = this._lenient;
        StringBuilder t3 = u.t(string22, str, StubApp.getString2(11125), string2, StubApp.getString2(11126));
        t3.append(bool);
        t3.append(StubApp.getString2(74));
        throw new ParseException(t3.toString(), 0);
    }

    public Date _parseDate(String str, ParsePosition parsePosition) throws ParseException {
        if (looksLikeISO8601(str)) {
            return parseAsISO8601(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (length > 0 || charAt != '-') {
                    break;
                }
            }
        }
        return (length >= 0 || !(str.charAt(0) == '-' || NumberInput.inLongRange(str, false))) ? parseAsRFC1123(str, parsePosition) : _parseDateFromLong(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this._timezone;
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        _format(timeZone, this._locale, date, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this._timezone;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this._lenient;
        return bool == null || bool.booleanValue();
    }

    public boolean looksLikeISO8601(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date _parseDate = _parseDate(trim, parsePosition);
        if (_parseDate != null) {
            return _parseDate;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (sb2.length() > 0) {
                sb2.append(StubApp.getString2(11127));
            } else {
                sb2.append(Typography.quote);
            }
            sb2.append(str2);
        }
        sb2.append(Typography.quote);
        throw new ParseException(AbstractC1482f.j(StubApp.getString2(11122), trim, StubApp.getString2(11128), sb2.toString(), StubApp.getString2(74)), parsePosition.getErrorIndex());
    }

    public Date parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return _parseAsISO8601(str, parsePosition);
        } catch (IllegalArgumentException e10) {
            throw new ParseException(AbstractC1482f.i(StubApp.getString2(11122), str, StubApp.getString2(11129), e10.getMessage()), parsePosition.getErrorIndex());
        }
    }

    public Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        if (this._formatRFC1123 == null) {
            this._formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123, StubApp.getString2(11117), this._timezone, this._locale, this._lenient);
        }
        return this._formatRFC1123.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        if (_equals(valueOf, this._lenient)) {
            return;
        }
        this._lenient = valueOf;
        _clearFormats();
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this._timezone)) {
            return;
        }
        _clearFormats();
        this._timezone = timeZone;
    }

    public String toPattern() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(StubApp.getString2(11130));
        return AbstractC1482f.k(sb2, Boolean.FALSE.equals(this._lenient) ? StubApp.getString2(11131) : StubApp.getString2(11132), StubApp.getString2(11133));
    }

    public String toString() {
        return String.format(StubApp.getString2(11134), getClass().getName(), this._timezone, this._locale, this._lenient);
    }

    public StdDateFormat withLenient(Boolean bool) {
        return _equals(bool, this._lenient) ? this : new StdDateFormat(this._timezone, this._locale, bool, this._tzSerializedWithColon);
    }

    public StdDateFormat withLocale(Locale locale) {
        return locale.equals(this._locale) ? this : new StdDateFormat(this._timezone, locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        TimeZone timeZone2 = this._timezone;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    @Override // java.text.DateFormat, java.text.Format
    public StdDateFormat clone() {
        return new StdDateFormat(this._timezone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z2) {
        this._timezone = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z2;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return _parseDate(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
