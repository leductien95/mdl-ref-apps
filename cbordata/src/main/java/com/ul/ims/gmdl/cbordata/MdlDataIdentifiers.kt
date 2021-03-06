/*
 * Copyright (C) 2019 Google LLC
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

package com.ul.ims.gmdl.cbordata

enum class MdlDataIdentifiers(val identifier : String) {
    FAMILY_NAME("family_name"),
    GIVEN_NAMES("given_name"),
    DATE_OF_BIRTH("birth_date"),
    DATE_OF_ISSUE("issue_date"),
    DATE_OF_EXPIRY("expiry_date"),
    ISSUING_COUNTRY("issuing_country"),
    ISSUING_AUTHORITY("issuing_authority"),
    LICENSE_NUMBER("document_number"),
    CATEGORIES_OF_VEHICLES("driving_privileges"),
    PORTRAIT_OF_HOLDER("portrait"),
    AGE_OVER_18("age_over_18"),
    AGE_OVER_21("age_over_21")
}