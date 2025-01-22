<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <table border="1px">
                    <tr>
                        <th>Área</th>
                        <th>Disponible</th>
                        <th>Unidad de medida</th>
                        <th>Proveedor</th>
                        <th>Compra mínima</th>
                    </tr>
                    <xsl:for-each select="Productos/producto">
                        <tr>
                            <td><xsl:value-of select="@area"/></td>
                            <td><xsl:value-of select="@disponible"/></td>
                            <td><xsl:value-of select="@UnidadMedida"/></td>
                            <td><xsl:value-of select="@proveedor"/></td>
                            <td><xsl:value-of select="@compraMinima"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
