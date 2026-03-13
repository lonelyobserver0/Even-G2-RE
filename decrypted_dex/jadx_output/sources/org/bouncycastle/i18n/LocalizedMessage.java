package org.bouncycastle.i18n;

import E1.a;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;
import org.bouncycastle.i18n.filter.Filter;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LocalizedMessage {
    public static final String DEFAULT_ENCODING = StubApp.getString2(2882);
    protected FilteredArguments arguments;
    protected String encoding;
    protected FilteredArguments extraArgs;
    protected Filter filter;
    protected final String id;
    protected ClassLoader loader;
    protected final String resource;

    public static class FilteredArguments {
        protected static final int FILTER = 1;
        protected static final int FILTER_URL = 2;
        protected static final int NO_FILTER = 0;
        protected int[] argFilterType;
        protected Object[] arguments;
        protected Filter filter;
        protected Object[] filteredArgs;
        protected boolean[] isLocaleSpecific;
        protected Object[] unpackedArgs;

        public FilteredArguments() {
            this(new Object[0]);
        }

        private Object filter(int i3, Object obj) {
            Filter filter = this.filter;
            if (filter != null) {
                if (obj == null) {
                    obj = StubApp.getString2(1116);
                }
                if (i3 != 0) {
                    if (i3 == 1) {
                        return filter.doFilter(obj.toString());
                    }
                    if (i3 != 2) {
                        return null;
                    }
                    return filter.doFilterUrl(obj.toString());
                }
            }
            return obj;
        }

        public Object[] getArguments() {
            return this.arguments;
        }

        public Filter getFilter() {
            return this.filter;
        }

        public Object[] getFilteredArgs(Locale locale) {
            Object[] objArr = new Object[this.unpackedArgs.length];
            int i3 = 0;
            while (true) {
                Object[] objArr2 = this.unpackedArgs;
                if (i3 >= objArr2.length) {
                    return objArr;
                }
                Object obj = this.filteredArgs[i3];
                if (obj == null) {
                    Object obj2 = objArr2[i3];
                    if (this.isLocaleSpecific[i3]) {
                        obj = filter(this.argFilterType[i3], ((LocaleString) obj2).getLocaleString(locale));
                    } else {
                        obj = filter(this.argFilterType[i3], obj2);
                        this.filteredArgs[i3] = obj;
                    }
                }
                objArr[i3] = obj;
                i3++;
            }
        }

        public boolean isEmpty() {
            return this.unpackedArgs.length == 0;
        }

        public void setFilter(Filter filter) {
            if (filter != this.filter) {
                for (int i3 = 0; i3 < this.unpackedArgs.length; i3++) {
                    this.filteredArgs[i3] = null;
                }
            }
            this.filter = filter;
        }

        public FilteredArguments(Object[] objArr) {
            this.filter = null;
            this.arguments = objArr;
            this.unpackedArgs = new Object[objArr.length];
            this.filteredArgs = new Object[objArr.length];
            this.isLocaleSpecific = new boolean[objArr.length];
            this.argFilterType = new int[objArr.length];
            for (int i3 = 0; i3 < objArr.length; i3++) {
                Object obj = objArr[i3];
                if (obj instanceof TrustedInput) {
                    this.unpackedArgs[i3] = ((TrustedInput) obj).getInput();
                    this.argFilterType[i3] = 0;
                } else if (obj instanceof UntrustedInput) {
                    this.unpackedArgs[i3] = ((UntrustedInput) obj).getInput();
                    if (objArr[i3] instanceof UntrustedUrlInput) {
                        this.argFilterType[i3] = 2;
                    } else {
                        this.argFilterType[i3] = 1;
                    }
                } else {
                    this.unpackedArgs[i3] = obj;
                    this.argFilterType[i3] = 1;
                }
                this.isLocaleSpecific[i3] = this.unpackedArgs[i3] instanceof LocaleString;
            }
        }
    }

    public LocalizedMessage(String str, String str2) throws NullPointerException {
        this.encoding = StubApp.getString2(2882);
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments();
    }

    public String addExtraArgs(String str, Locale locale) {
        if (this.extraArgs == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        Object[] filteredArgs = this.extraArgs.getFilteredArgs(locale);
        for (Object obj : filteredArgs) {
            stringBuffer.append(obj);
        }
        return stringBuffer.toString();
    }

    public String formatWithTimeZone(String str, Object[] objArr, Locale locale, TimeZone timeZone) {
        MessageFormat messageFormat = new MessageFormat(StubApp.getString2(397));
        messageFormat.setLocale(locale);
        messageFormat.applyPattern(str);
        if (!timeZone.equals(TimeZone.getDefault())) {
            Format[] formats = messageFormat.getFormats();
            for (int i3 = 0; i3 < formats.length; i3++) {
                Format format = formats[i3];
                if (format instanceof DateFormat) {
                    DateFormat dateFormat = (DateFormat) format;
                    dateFormat.setTimeZone(timeZone);
                    messageFormat.setFormat(i3, dateFormat);
                }
            }
        }
        return messageFormat.format(objArr);
    }

    public Object[] getArguments() {
        return this.arguments.getArguments();
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public String getEntry(String str, Locale locale, TimeZone timeZone) throws MissingEntryException {
        String string2 = StubApp.getString2(2882);
        String str2 = this.id;
        String string22 = StubApp.getString2(1);
        if (str != null) {
            str2 = AbstractC1482f.h(str2, string22, str);
        }
        String str3 = str2;
        try {
            ClassLoader classLoader = this.loader;
            String string = (classLoader == null ? ResourceBundle.getBundle(this.resource, locale) : ResourceBundle.getBundle(this.resource, locale, classLoader)).getString(str3);
            if (!this.encoding.equals(string2)) {
                string = new String(string.getBytes(string2), this.encoding);
            }
            if (!this.arguments.isEmpty()) {
                string = formatWithTimeZone(string, this.arguments.getFilteredArgs(locale), locale, timeZone);
            }
            return addExtraArgs(string, locale);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        } catch (MissingResourceException unused) {
            String k3 = AbstractC1482f.k(b.l(StubApp.getString2(29570), str3, StubApp.getString2(29571)), this.resource, string22);
            String str4 = this.resource;
            ClassLoader classLoader2 = this.loader;
            if (classLoader2 == null) {
                classLoader2 = getClassLoader();
            }
            throw new MissingEntryException(k3, str4, str3, locale, classLoader2);
        }
    }

    public Object[] getExtraArgs() {
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments == null) {
            return null;
        }
        return filteredArguments.getArguments();
    }

    public Filter getFilter() {
        return this.filter;
    }

    public String getId() {
        return this.id;
    }

    public String getResource() {
        return this.resource;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    public void setExtraArgument(Object obj) {
        setExtraArguments(new Object[]{obj});
    }

    public void setExtraArguments(Object[] objArr) {
        if (objArr == null) {
            this.extraArgs = null;
            return;
        }
        FilteredArguments filteredArguments = new FilteredArguments(objArr);
        this.extraArgs = filteredArguments;
        filteredArguments.setFilter(this.filter);
    }

    public void setFilter(Filter filter) {
        this.arguments.setFilter(filter);
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null) {
            filteredArguments.setFilter(filter);
        }
        this.filter = filter;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(29572));
        stringBuffer.append(this.resource);
        stringBuffer.append(StubApp.getString2(29573));
        stringBuffer.append(this.id);
        stringBuffer.append(StubApp.getString2(29574));
        stringBuffer.append(this.arguments.getArguments().length);
        stringBuffer.append(StubApp.getString2(29575));
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null && filteredArguments.getArguments().length > 0) {
            stringBuffer.append(StubApp.getString2(81));
            stringBuffer.append(this.extraArgs.getArguments().length);
            stringBuffer.append(StubApp.getString2(29576));
        }
        stringBuffer.append(StubApp.getString2(29577));
        stringBuffer.append(this.encoding);
        stringBuffer.append(StubApp.getString2(29578));
        stringBuffer.append(this.loader);
        return stringBuffer.toString();
    }

    public LocalizedMessage(String str, String str2, String str3) throws NullPointerException, UnsupportedEncodingException {
        this.encoding = StubApp.getString2(2882);
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments();
        if (!Charset.isSupported(str3)) {
            throw new UnsupportedEncodingException(a.k(StubApp.getString2(29569), str3, StubApp.getString2(8286)));
        }
        this.encoding = str3;
    }

    public LocalizedMessage(String str, String str2, String str3, Object[] objArr) throws NullPointerException, UnsupportedEncodingException {
        this.encoding = StubApp.getString2(2882);
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        if (objArr == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments(objArr);
        if (!Charset.isSupported(str3)) {
            throw new UnsupportedEncodingException(a.k(StubApp.getString2(29569), str3, StubApp.getString2(8286)));
        }
        this.encoding = str3;
    }

    public LocalizedMessage(String str, String str2, Object[] objArr) throws NullPointerException {
        this.encoding = StubApp.getString2(2882);
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        if (objArr == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments(objArr);
    }
}
