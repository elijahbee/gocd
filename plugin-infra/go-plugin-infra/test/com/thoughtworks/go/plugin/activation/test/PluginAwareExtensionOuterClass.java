/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.plugin.activation.test;

import com.thoughtworks.go.plugin.api.annotation.Extension;
import com.thoughtworks.go.plugin.api.info.PluginDescriptor;
import com.thoughtworks.go.plugin.api.info.PluginDescriptorAware;

@Extension
public class PluginAwareExtensionOuterClass implements PluginDescriptorAware {
    @Override
    public void setPluginDescriptor(PluginDescriptor descriptor) {
        throw new UnsupportedOperationException();
    }

    @Extension
    public static class PluginAwareExtensionNestedClass implements PluginDescriptorAware {

        @Override
        public void setPluginDescriptor(PluginDescriptor descriptor) {
            throw new UnsupportedOperationException();
        }
    }

    @Extension
    public class PluginAwareExtensionInnerClass implements PluginDescriptorAware {

        @Override
        public void setPluginDescriptor(PluginDescriptor descriptor) {
            throw new UnsupportedOperationException();
        }

        public class PluginAwareExtensionSecondLevelInnerClass {

            @Extension
            public class PluginAwareExtensionThirdLevelInnerClass implements PluginDescriptorAware {

                @Override
                public void setPluginDescriptor(PluginDescriptor descriptor) {
                    throw new UnsupportedOperationException();
                }
            }

        }

        public class PluginAwareExtensionSecondLevelSiblingInnerClassWhichDoesNotHaveADefaultConstructor {
            public PluginAwareExtensionSecondLevelSiblingInnerClassWhichDoesNotHaveADefaultConstructor(int x) {
            }

            @Extension
            public class PluginAwareExtensionThirdLevelInnerClassWhichHasInvalidParent implements PluginDescriptorAware {

                @Override
                public void setPluginDescriptor(PluginDescriptor descriptor) {
                    throw new UnsupportedOperationException();
                }
            }

        }

    }
}
