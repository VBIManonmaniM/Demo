import sys
import os
import re
import json
import pandas as pd

property_list=pd.read_excel('VBX_APS_CHART_FINAL.XLSX',header=0,index_col=0)
property_list22=pd.read_excel('VBX_APS_CHART_FINAL.XLSX',header=0,index_col=1)
property_list=property_list.replace('No','NAP').replace('Yes','No')
technical_names=property_list.index.values
missing_technical_names=[]
with open('automatedProperties.json') as data_file:
    automated_properties_list = json.load(data_file)
for component_name in automated_properties_list:
	property_list_column_names = property_list.columns.values
	component_column_name=[column_name for column_name in property_list_column_names if component_name.strip().lower() == column_name.strip().lower()][0]
	print("Writing Results for : "+component_name)
	for biapp_property in automated_properties_list[component_name]:
		if(biapp_property in technical_names):
			property_list[component_column_name][biapp_property]="Yes"
		else:
			if(biapp_property not in missing_technical_names):
				missing_technical_names.append(biapp_property)
			
		
component_names=automated_properties_list.keys()
component_names=[component_name.lower() for component_name in component_names]
for column_name in property_list.columns.values:
    if( column_name not in ['EXISTING GROUP 1','EXISTING GROUP 2','EXISTING PROPERTY NAME'] and column_name.strip().lower() not in component_names):
        del property_list[column_name]
print("Missing Properties : ",missing_technical_names)
property_list.to_excel("AUTOMATED_PROPERTIES.xlsx");
