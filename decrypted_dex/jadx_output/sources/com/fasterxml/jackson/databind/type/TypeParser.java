package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import i2.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TypeParser implements Serializable {
    protected final TypeFactory _factory;

    public static final class MyTokenizer extends StringTokenizer {
        protected int _index;
        protected final String _input;
        protected String _pushbackToken;

        public MyTokenizer(String str) {
            super(str, StubApp.getString2(11056), true);
            this._input = str;
        }

        public String getAllInput() {
            return this._input;
        }

        public String getRemainingInput() {
            return this._input.substring(this._index);
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this._pushbackToken != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this._pushbackToken;
            if (str != null) {
                this._pushbackToken = null;
                return str;
            }
            String nextToken = super.nextToken();
            this._index = nextToken.length() + this._index;
            return nextToken.trim();
        }

        public void pushBack(String str) {
            this._pushbackToken = str;
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(MyTokenizer myTokenizer, String str) {
        StringBuilder t3 = u.t("Failed to parse type '", myTokenizer.getAllInput(), "' (remaining: '", myTokenizer.getRemainingInput(), "'): ");
        t3.append(str);
        return new IllegalArgumentException(t3.toString());
    }

    public Class<?> findClass(String str, MyTokenizer myTokenizer) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e10) {
            ClassUtil.throwIfRTE(e10);
            throw _problem(myTokenizer, "Cannot locate class '" + str + "', problem: " + e10.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        MyTokenizer myTokenizer = new MyTokenizer(str.trim());
        JavaType parseType = parseType(myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            throw _problem(myTokenizer, "Unexpected tokens after complete type");
        }
        return parseType;
    }

    public JavaType parseType(MyTokenizer myTokenizer) throws IllegalArgumentException {
        if (!myTokenizer.hasMoreTokens()) {
            throw _problem(myTokenizer, "Unexpected end-of-string");
        }
        Class<?> findClass = findClass(myTokenizer.nextToken(), myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            String nextToken = myTokenizer.nextToken();
            if ("<".equals(nextToken)) {
                return this._factory._fromClass(null, findClass, TypeBindings.create(findClass, parseTypes(myTokenizer)));
            }
            myTokenizer.pushBack(nextToken);
        }
        return this._factory._fromClass(null, findClass, TypeBindings.emptyBindings());
    }

    public List<JavaType> parseTypes(MyTokenizer myTokenizer) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (myTokenizer.hasMoreTokens()) {
            arrayList.add(parseType(myTokenizer));
            if (!myTokenizer.hasMoreTokens()) {
                break;
            }
            String nextToken = myTokenizer.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw _problem(myTokenizer, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }
}
