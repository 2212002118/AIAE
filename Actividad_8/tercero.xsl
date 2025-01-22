<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
    <html>
        <head>
            <title>Catálogo de Productos</title>
        </head>
        <body>
            <table border="1">
                <tr>
                    <th>Tipo de catalogo</th>
                    <th>Proveedor</th>
                    <th>Gafas</th>
                    <th>Pantalones</th>
                    <th>Playeras</th>
                </tr>
                <xsl:for-each select="catalogo/nombreCatalogo">
                    <tr>
                        <!-- Mostramos el tipo de catalogo -->
                        <td><xsl:value-of select="@id"/></td>
                        <!-- Mostrar nombres de los proveedores -->
                        <td>
                            <xsl:for-each select="provedor/nombre">
                                <xsl:value-of select="."/><br/>
                            </xsl:for-each>
                            <xsl:for-each select="provedor/apellido">
                                <xsl:value-of select="."/><br/>
                            </xsl:for-each>
                        </td>
                        <!-- Mostrar productos -->
                        <td><xsl:value-of select="productos/gafas"/></td>
                        <td><xsl:value-of select="productos/pantalones"/></td>
                        <td><xsl:value-of select="productos/playera"/></td>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>

</xsl:stylesheet>
