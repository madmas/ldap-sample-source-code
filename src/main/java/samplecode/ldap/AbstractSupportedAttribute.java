/*
 * Copyright 2008-2011 UnboundID Corp. All Rights Reserved.
 */
/*
 * Copyright (C) 2008-2011 UnboundID Corp. This program is free
 * software; you can redistribute it and/or modify it under the terms of
 * the GNU General Public License (GPLv2 only) or the terms of the GNU
 * Lesser General Public License (LGPLv2.1 only) as published by the
 * Free Software Foundation. This program is distributed in the hope
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details. You
 * should have received a copy of the GNU General Public License along
 * with this program; if not, see <http://www.gnu.org/licenses>.
 */

package samplecode.ldap;


import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import samplecode.annotation.Author;
import samplecode.annotation.CodeVersion;
import samplecode.annotation.Since;
import samplecode.exception.AttributeNotSupportedException;


/**
 * Base class for classes that check whether a given attribute is
 * supported.
 */
@Author("terry.gardner@unboundid.com")
@Since("Dec 30, 2011")
@CodeVersion("1.0")
abstract class AbstractSupportedAttribute {

  /**
   * Checks whether the provided {@code attributeName} is supported by
   * the directory server to which this LDAP client is connected.
   *
   * @param ldapConnection
   *   A valid connection to a directory server to be used to
   *   determine whether an attribute is supported by that
   *   directory server.
   * @param attributeName
   *   The name of an attribute to check. The
   *   {@code attributeName} parameter may not be {@code null}.
   *
   * @throws samplecode.exception.AttributeNotSupportedException
   *   If the attribute is not supported.
   * @throws LDAPException
   *   If a problem occurs while obtaining the server schema.
   */
  public abstract void
  supported(final LDAPConnection ldapConnection, final String attributeName)
    throws AttributeNotSupportedException, LDAPException;
}
