/*
 * Copyright 2012, Institute of Cybernetics at Tallinn University of Technology
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

package kaljurand_at_gmail_dot_com.diktofon;

public class Log {

	public static final String LOG_TAG = "kaljurand_at_gmail_dot_com.diktofon";

	public static int i(String msg) {
		return android.util.Log.i(LOG_TAG, msg);
	}

	public static int e(String msg) {
		return android.util.Log.e(LOG_TAG, msg);
	}

	public static int i(String tag, String msg) {
		return android.util.Log.i(tag, msg);
	}

	public static int e(String tag, String msg) {
		return android.util.Log.e(tag, msg);
	}
}