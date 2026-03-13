package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.stub.StubApp;
import i2.u;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SubTypeValidator {
    protected static final Set<String> DEFAULT_NO_DESER_CLASS_NAMES;
    private static final SubTypeValidator instance;
    protected Set<String> _cfgIllegalClassNames = DEFAULT_NO_DESER_CLASS_NAMES;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(StubApp.getString2(10873));
        hashSet.add(StubApp.getString2(10874));
        hashSet.add(StubApp.getString2(10875));
        hashSet.add(StubApp.getString2(10876));
        hashSet.add(StubApp.getString2(10877));
        u.B(hashSet, StubApp.getString2(10878), StubApp.getString2(10879), StubApp.getString2(10880), StubApp.getString2(10881));
        u.B(hashSet, StubApp.getString2(10882), StubApp.getString2(10883), StubApp.getString2(10884), StubApp.getString2(10885));
        u.B(hashSet, StubApp.getString2(10886), StubApp.getString2(10887), StubApp.getString2(10888), StubApp.getString2(10889));
        u.B(hashSet, StubApp.getString2(10890), StubApp.getString2(10891), StubApp.getString2(10892), StubApp.getString2(10893));
        u.B(hashSet, StubApp.getString2(10894), StubApp.getString2(10895), StubApp.getString2(10896), StubApp.getString2(10897));
        u.B(hashSet, StubApp.getString2(10898), StubApp.getString2(10899), StubApp.getString2(10900), StubApp.getString2(10901));
        u.B(hashSet, StubApp.getString2(10902), StubApp.getString2(10903), StubApp.getString2(10904), StubApp.getString2(10905));
        u.B(hashSet, StubApp.getString2(10906), StubApp.getString2(10907), StubApp.getString2(10908), StubApp.getString2(10909));
        u.B(hashSet, StubApp.getString2(10910), StubApp.getString2(10911), StubApp.getString2(10912), StubApp.getString2(10913));
        u.B(hashSet, StubApp.getString2(10914), StubApp.getString2(10915), StubApp.getString2(10916), StubApp.getString2(10917));
        u.B(hashSet, StubApp.getString2(10918), StubApp.getString2(10919), StubApp.getString2(10920), StubApp.getString2(10921));
        u.B(hashSet, StubApp.getString2(10922), StubApp.getString2(10923), StubApp.getString2(10924), StubApp.getString2(10925));
        u.B(hashSet, StubApp.getString2(10926), StubApp.getString2(10927), StubApp.getString2(10928), StubApp.getString2(10929));
        u.B(hashSet, StubApp.getString2(10930), StubApp.getString2(10931), StubApp.getString2(10932), StubApp.getString2(10933));
        u.B(hashSet, StubApp.getString2(10934), StubApp.getString2(10935), StubApp.getString2(10936), StubApp.getString2(10937));
        u.B(hashSet, StubApp.getString2(10938), StubApp.getString2(10939), StubApp.getString2(10940), StubApp.getString2(10941));
        u.B(hashSet, StubApp.getString2(10942), StubApp.getString2(10943), StubApp.getString2(10944), StubApp.getString2(10945));
        u.B(hashSet, StubApp.getString2(10946), StubApp.getString2(10947), StubApp.getString2(10948), StubApp.getString2(10949));
        u.B(hashSet, StubApp.getString2(10950), StubApp.getString2(10951), StubApp.getString2(10952), StubApp.getString2(10953));
        u.B(hashSet, StubApp.getString2(10954), StubApp.getString2(10955), StubApp.getString2(10956), StubApp.getString2(10957));
        u.B(hashSet, StubApp.getString2(10958), StubApp.getString2(10959), StubApp.getString2(10960), StubApp.getString2(10961));
        u.B(hashSet, StubApp.getString2(10962), StubApp.getString2(10963), StubApp.getString2(10964), StubApp.getString2(10965));
        u.B(hashSet, StubApp.getString2(10966), StubApp.getString2(10967), StubApp.getString2(10968), StubApp.getString2(10969));
        u.B(hashSet, StubApp.getString2(10970), StubApp.getString2(10971), StubApp.getString2(10972), StubApp.getString2(10973));
        u.B(hashSet, StubApp.getString2(10974), StubApp.getString2(10975), StubApp.getString2(10976), StubApp.getString2(10977));
        hashSet.add(StubApp.getString2(10978));
        hashSet.add(StubApp.getString2(10979));
        hashSet.add(StubApp.getString2(10980));
        DEFAULT_NO_DESER_CLASS_NAMES = Collections.unmodifiableSet(hashSet);
        instance = new SubTypeValidator();
    }

    public static SubTypeValidator instance() {
        return instance;
    }

    public void validateSubType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        String name = rawClass.getName();
        if (!this._cfgIllegalClassNames.contains(name)) {
            if (rawClass.isInterface()) {
                return;
            }
            if (name.startsWith(StubApp.getString2(10981))) {
                while (rawClass != null && rawClass != Object.class) {
                    String simpleName = rawClass.getSimpleName();
                    if (!StubApp.getString2(10982).equals(simpleName) && !StubApp.getString2(10983).equals(simpleName)) {
                        rawClass = rawClass.getSuperclass();
                    }
                }
                return;
            }
            if (!name.startsWith(StubApp.getString2(10984)) || !name.endsWith(StubApp.getString2(10985))) {
                return;
            }
        }
        deserializationContext.reportBadTypeDefinition(beanDescription, StubApp.getString2(10986), name);
    }
}
