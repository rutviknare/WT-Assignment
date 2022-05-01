<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/Employees">

		<html>
			<body bgcolor="grey">
				<h2 align="center" margin-top="20%">Employees Personal Information</h2>

				<table border="4" width="50%" height="50%" text-align="center" align="center" bgcolor="lightblue">
					<tr bgcolor="green" color="white">
						<th>Id</th>
						<th>Name</th>
						<th>Date Of Birth</th>
						<th>Salary</th>
					</tr>

					<xsl:for-each select="employee">

						<tr >
							<td align="center">
								<xsl:value-of select="id" />
							</td>
							<td align="center">
								<xsl:value-of select="Name" />
							</td>
							<td align="center">
								<xsl:value-of select="Date_of_Birth" />
							</td>
							<td align="center">
								<xsl:value-of select="salary" />
							</td>
						</tr>

					</xsl:for-each>

				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>