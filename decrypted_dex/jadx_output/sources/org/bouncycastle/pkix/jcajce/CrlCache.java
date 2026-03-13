package org.bouncycastle.pkix.jcajce;

import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CrlCache {
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<PKIXCRLStore>> cache = Collections.synchronizedMap(new WeakHashMap());

    public static class LocalCRLStore<T extends CRL> implements PKIXCRLStore, Iterable<CRL> {
        private Collection<CRL> _local;

        public LocalCRLStore(Store<CRL> store) {
            this._local = new ArrayList(store.getMatches(null));
        }

        @Override // org.bouncycastle.jcajce.PKIXCRLStore, org.bouncycastle.util.Store
        public Collection getMatches(Selector selector) {
            if (selector == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl : this._local) {
                if (selector.match(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
        public Iterator<CRL> iterator() {
            return getMatches(null).iterator();
        }
    }

    public static synchronized PKIXCRLStore getCrl(CertificateFactory certificateFactory, Date date, URI uri) throws IOException, CRLException {
        synchronized (CrlCache.class) {
            try {
                WeakReference<PKIXCRLStore> weakReference = cache.get(uri);
                PKIXCRLStore pKIXCRLStore = weakReference != null ? weakReference.get() : null;
                if (pKIXCRLStore != null) {
                    Iterator it = pKIXCRLStore.getMatches(null).iterator();
                    while (it.hasNext()) {
                        Date nextUpdate = ((X509CRL) it.next()).getNextUpdate();
                        if (nextUpdate == null || !nextUpdate.before(date)) {
                        }
                    }
                    return pKIXCRLStore;
                }
                LocalCRLStore localCRLStore = new LocalCRLStore(new CollectionStore(uri.getScheme().equals(StubApp.getString2("32663")) ? getCrlsFromLDAP(certificateFactory, uri) : getCrls(certificateFactory, uri)));
                cache.put(uri, new WeakReference<>(localCRLStore));
                return localCRLStore;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Collection getCrls(CertificateFactory certificateFactory, URI uri) throws IOException, CRLException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) uri.toURL().openConnection();
        httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
        httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
        InputStream inputStream = httpURLConnection.getInputStream();
        Collection<? extends CRL> generateCRLs = certificateFactory.generateCRLs(inputStream);
        inputStream.close();
        return generateCRLs;
    }

    private static Collection getCrlsFromLDAP(CertificateFactory certificateFactory, URI uri) throws IOException, CRLException {
        Hashtable hashtable = new Hashtable();
        hashtable.put(StubApp.getString2(28084), StubApp.getString2(32664));
        hashtable.put(StubApp.getString2(28088), uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get(StubApp.getString2("32665")).get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
            }
            throw new CRLException(StubApp.getString2(32666) + uri);
        } catch (NamingException e10) {
            throw new CRLException(StubApp.getString2(32667) + uri.toString(), e10);
        }
    }
}
