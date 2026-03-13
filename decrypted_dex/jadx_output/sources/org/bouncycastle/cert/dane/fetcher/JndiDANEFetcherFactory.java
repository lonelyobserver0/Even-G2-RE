package org.bouncycastle.cert.dane.fetcher;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.naming.Binding;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import org.bouncycastle.cert.dane.DANEEntry;
import org.bouncycastle.cert.dane.DANEEntryFetcher;
import org.bouncycastle.cert.dane.DANEEntryFetcherFactory;
import org.bouncycastle.cert.dane.DANEException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JndiDANEFetcherFactory implements DANEEntryFetcherFactory {
    private static final String DANE_TYPE = StubApp.getString2(28089);
    private List dnsServerList = new ArrayList();
    private boolean isAuthoritative;

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntries(List list, String str, Attribute attribute) throws NamingException, DANEException {
        for (int i3 = 0; i3 != attribute.size(); i3++) {
            byte[] bArr = (byte[]) attribute.get(i3);
            if (DANEEntry.isValidCertificate(bArr)) {
                try {
                    list.add(new DANEEntry(str, bArr));
                } catch (IOException e10) {
                    throw new DANEException(u.q(e10, new StringBuilder(StubApp.getString2(28083))), e10);
                }
            }
        }
    }

    @Override // org.bouncycastle.cert.dane.DANEEntryFetcherFactory
    public DANEEntryFetcher build(final String str) {
        final Hashtable hashtable = new Hashtable();
        hashtable.put(StubApp.getString2(28084), StubApp.getString2(28085));
        hashtable.put(StubApp.getString2(28086), this.isAuthoritative ? StubApp.getString2(6547) : StubApp.getString2(9372));
        if (this.dnsServerList.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = this.dnsServerList.iterator();
            while (it.hasNext()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(StubApp.getString2(397));
                }
                stringBuffer.append(StubApp.getString2(28087) + it.next());
            }
            hashtable.put(StubApp.getString2(28088), stringBuffer.toString());
        }
        return new DANEEntryFetcher() { // from class: org.bouncycastle.cert.dane.fetcher.JndiDANEFetcherFactory.1
            @Override // org.bouncycastle.cert.dane.DANEEntryFetcher
            public List getEntries() throws DANEException {
                String string2 = StubApp.getString2(28081);
                ArrayList arrayList = new ArrayList();
                try {
                    InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                    if (str.indexOf(string2) > 0) {
                        Attribute attribute = initialDirContext.getAttributes(str, new String[]{"53"}).get("53");
                        if (attribute != null) {
                            JndiDANEFetcherFactory.this.addEntries(arrayList, str, attribute);
                            return arrayList;
                        }
                    } else {
                        NamingEnumeration listBindings = initialDirContext.listBindings(string2 + str);
                        while (listBindings.hasMore()) {
                            DirContext dirContext = (DirContext) ((Binding) listBindings.next()).getObject();
                            Attribute attribute2 = initialDirContext.getAttributes(dirContext.getNameInNamespace().substring(1, dirContext.getNameInNamespace().length() - 1), new String[]{"53"}).get("53");
                            if (attribute2 != null) {
                                String nameInNamespace = dirContext.getNameInNamespace();
                                JndiDANEFetcherFactory.this.addEntries(arrayList, nameInNamespace.substring(1, nameInNamespace.length() - 1), attribute2);
                            }
                        }
                    }
                    return arrayList;
                } catch (NamingException e10) {
                    throw new DANEException(StubApp.getString2(28082) + e10.getMessage(), e10);
                }
            }
        };
    }

    public JndiDANEFetcherFactory setAuthoritative(boolean z2) {
        this.isAuthoritative = z2;
        return this;
    }

    public JndiDANEFetcherFactory usingDNSServer(String str) {
        this.dnsServerList.add(str);
        return this;
    }
}
