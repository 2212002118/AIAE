<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/2024/Catalogo">
    <xsl:template match="/">
        <html>
            <body>
                <table border="1px">
                    <tr>
                        <th>Area</th>
                        <th>Disponible</th>
                        <th>Unidad de medida</th>
                        <th>Proovedor</th>
                        <th>Compra minima</th>
                    </tr>
                    <xsl:for-each select="Productos/producto">
                        <tr>
                            <td><xsl:value-of select="area"/></td>
                            <td><xsl:value-of select="disponible"/></td>
                            <td><xsl:value-of select="UnidadMedida"/></td>
                            <td><xsl:value-of select="proovedor"/></td>
                            <td><xsl:value-of select="compraMinima"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>