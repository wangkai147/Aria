/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.aria.m3u8.vod;

import com.arialyy.aria.core.processor.IVodTsUrlConverter;
import java.util.ArrayList;
import java.util.List;

/**
 * 默认的m3u8 ts转换器
 */
class VodTsDefConverter implements IVodTsUrlConverter {
  @Override public List<String> convert(String m3u8Url, List<String> tsUrls) {
    int index = m3u8Url.lastIndexOf("/");
    List<String> convertedTsUrl = new ArrayList<>();

    String parentUrl = m3u8Url.substring(0, index + 1);
    for (String temp : tsUrls) {
      convertedTsUrl.add(parentUrl + temp);
    }
    return convertedTsUrl;
  }
}
