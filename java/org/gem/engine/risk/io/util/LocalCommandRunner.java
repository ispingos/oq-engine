/*
 * [COPYRIGHT]
 *
 * [NAME] is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.gem.engine.risk.io.util;

/**
 * Runs a command on the local machine.
 * 
 * @author Andrea Cerisara
 * @version $Id: LocalCommandRunner.java 537 2010-06-16 18:29:36Z acerisara $
 */
public class LocalCommandRunner implements CommandRunner
{

    @Override
    public void run(String command)
    {
        try
        {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

}
