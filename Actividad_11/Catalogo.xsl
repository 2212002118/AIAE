<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:strip-space elements="*"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>Catálogo de Productos</title>
                <link rel="stylesheet" type="text/css" href="styles.css"></link>
            </head>
            <body>
                <h2>Catálogo de Productos</h2>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Nombre del Producto</th>
                            <th>Área</th>
                            <th>Disponible</th>
                            <th>Unidad de Medida</th>
                            <th>Proveedor</th>
                            <th>Compra Mínima</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:for-each select="Productos/producto">
                            <tr>
                                <td><xsl:value-of select="normalize-space(.)"/></td>
                                <td><xsl:value-of select="@area"/></td>
                                <td><xsl:value-of select="@disponible"/></td>
                                <td><xsl:value-of select="@UnidadMedida"/></td>
                                <td><xsl:value-of select="@proveedor"/></td>
                                <td><xsl:value-of select="@compraMinima"/></td>
                            </tr>
                        </xsl:for-each>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
