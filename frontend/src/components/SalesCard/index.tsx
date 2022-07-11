import NotificationButton from '../NotificationButton';
import './styles.css';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';

interface IList {
  id: String;
  data: String;
  vendedor: String;
  visitas: String;
  vendas: String;
  total: String;
}

function SalesCard() {
  const list: IList[] = [
    {
      id: '#341',
      data: '08/07/2022',
      vendedor: 'Anakin',
      visitas: '15',
      vendas: '11',
      total: 'R$ 55300.00',
    },
  ];

  return (
    <div className="dsmeta-card">
      <h2 className="dsmeta-sales-title">Vendas</h2>
      <div>
        <div className="dsmeta-form-control-container">
          <DatePicker
            selected={new Date()}
            onChange={(date: Date) => {}}
            className="dsmeta-form-control"
            dateFormat="dd/MM/yyyy"
          />
        </div>
        <div className="dsmeta-form-control-container">
          <DatePicker
            selected={new Date()}
            onChange={(date: Date) => {}}
            className="dsmeta-form-control"
            dateFormat="dd/MM/yyyy"
          />
        </div>
      </div>

      <div>
        <table className="dsmeta-sales-table">
          <thead>
            <tr>
              <th>ID</th>
              <th>Data</th>
              <th>Vendedor</th>
              <th>Visitas</th>
              <th>Vendas</th>
              <th>Total</th>
              <th>Notificar</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>#341</td>
              <td>08/07/2022</td>
              <td>Anakin</td>
              <td>15</td>
              <td>11</td>
              <td>R$ 55300.00</td>
              <td>
                <div className="dsmeta-red-btn-container">
                  <NotificationButton />
                </div>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default SalesCard;
