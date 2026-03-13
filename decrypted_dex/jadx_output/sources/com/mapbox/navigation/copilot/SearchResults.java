package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/mapbox/navigation/copilot/SearchResults;", "", "", "provider", "request", "response", "error", "searchQuery", "", "Lcom/mapbox/navigation/copilot/HistorySearchResult;", "results", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getProvider", "getRequest", "getResponse", "getError", "getSearchQuery", "Ljava/util/List;", "getResults", "()Ljava/util/List;", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SearchResults {
    private final String error;
    private final String provider;
    private final String request;
    private final String response;
    private final List<HistorySearchResult> results;
    private final String searchQuery;

    public SearchResults(String provider, String request, String str, String str2, String searchQuery, List<HistorySearchResult> list) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.provider = provider;
        this.request = request;
        this.response = str;
        this.error = str2;
        this.searchQuery = searchQuery;
        this.results = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SearchResults.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.copilot.SearchResults");
        SearchResults searchResults = (SearchResults) other;
        if (Intrinsics.areEqual(this.provider, searchResults.provider) && Intrinsics.areEqual(this.request, searchResults.request) && Intrinsics.areEqual(this.response, searchResults.response) && Intrinsics.areEqual(this.error, searchResults.error) && Intrinsics.areEqual(this.searchQuery, searchResults.searchQuery)) {
            return Intrinsics.areEqual(this.results, searchResults.results);
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getRequest() {
        return this.request;
    }

    public final String getResponse() {
        return this.response;
    }

    public final List<HistorySearchResult> getResults() {
        return this.results;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public int hashCode() {
        int d8 = u.d(this.provider.hashCode() * 31, 31, this.request);
        String str = this.response;
        int hashCode = (d8 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.error;
        int d10 = u.d((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.searchQuery);
        List<HistorySearchResult> list = this.results;
        return d10 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(14665) + this.provider + StubApp.getString2(14666) + this.request + StubApp.getString2(14667) + this.response + StubApp.getString2(14668) + this.error + StubApp.getString2(14669) + this.searchQuery + StubApp.getString2(14670) + this.results + ')';
    }
}
