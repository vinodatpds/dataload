/*	
 * Copyright IBM Corp. 2014
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.dataworks;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.ibm.websphere.jaxrs.providers.json4j.JSON4JArrayProvider;
import com.ibm.websphere.jaxrs.providers.json4j.JSON4JObjectProvider;

/**
 * Sample application showing the usage of the data load REST API.
 */
@ApplicationPath("refinery")
public class DataLoadApplication extends Application 
{
    /**
     * {@inheritDoc}
     */
	@Override
	public Set<Class<?>> getClasses() 
	{
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(DataLoadResource.class);
	    classes.add(JSON4JObjectProvider.class);
	    classes.add(JSON4JArrayProvider.class);
		return classes;
	}
}
