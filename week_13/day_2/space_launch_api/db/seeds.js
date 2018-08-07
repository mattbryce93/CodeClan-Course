use spacelaunchesdb;
db.dropDatabase();

db.launches.insert([
	{
		"_id": "5b6998a1853c86da397ee324",
		"id": 1095,
		"name": "Delta IV Heavy | Parker Solar Probe",
		"windowstart": "August 11, 2018 07:48:00 UTC",
		"windowend": "August 11, 2018 08:33:00 UTC"
	},
	{
		"_id": "5b6998a1853c86da397ee325",
		"id": 1071,
		"name": "Vega | ADM-Aeolus",
		"windowstart": "August 21, 2018 21:20:00 UTC",
		"windowend": "August 21, 2018 21:20:00 UTC"
	},
	{
		"_id": "5b6998a1853c86da397ee326",
		"id": 1392,
		"name": "Falcon 9 Block 5 | Telstar 18 VANTAGE",
		"windowstart": "August 24, 2018 03:33:00 UTC",
		"windowend": "August 24, 2018 03:33:00 UTC"
	},
	{
		"_id": "5b6998a1853c86da397ee327",
		"id": 1603,
		"name": "LauncherOne | Test Flight",
		"windowstart": "August 31, 2018 00:00:00 UTC",
		"windowend": "August 31, 2018 00:00:00 UTC"
	},
	{
		"_id": "5b6998a1853c86da397ee328",
		"id": 1435,
		"name": "Long March 3B | SupremeSAT-2",
		"windowstart": "September 1, 2018 00:00:00 UTC",
		"windowend": "September 1, 2018 00:00:00 UTC"
	}
]);
