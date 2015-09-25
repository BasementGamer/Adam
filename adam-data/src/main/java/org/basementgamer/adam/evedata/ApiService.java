package org.basementgamer.adam.evedata;

import org.basementgamer.adam.model.ApiCallGroup;

import java.util.Collection;

/**
 * @author gucastro
 */
public interface ApiService {
    Collection<ApiCallGroup> getCallList();
}
